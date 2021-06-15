package agh;

import java.io.PrintStream;

public class TKiK_Final_Visitor extends TKiKBaseVisitor
{
    private final PrintStream stream;

    private int indent = 0;

    TKiK_Final_Visitor(PrintStream stream){
        this.stream = stream;
    }

    @Override
    public Object visitEntire_program(TKiKParser.Entire_programContext ctx) {
        super.visitEntire_program(ctx);

        stream.print("if __name__ == \'__main__\':\n\tmain()");

        return null;
    }

    @Override
    public Object visitLibrary(TKiKParser.LibraryContext ctx) {
        stream.println("# Please ensure that this library is available in Python 3.0: import " + ctx.ID());
        return super.visitLibrary(ctx);
    }

    @Override
    public Object visitUsing(TKiKParser.UsingContext ctx) {
        stream.print("\n");
        return super.visitUsing(ctx);
    }

    @Override
    public Object visitFunction(TKiKParser.FunctionContext ctx) {
        stream.print("def " + ctx.ID() + ctx.LEFTPAREN());
        if(ctx.argument() != null) visitArgument(ctx.argument());
        stream.println(ctx.RIGHTPAREN() + ":");
        indent += 1;
        return visitBody(ctx.body());
    }

    @Override
    public Object visitArgument(TKiKParser.ArgumentContext ctx) {
        for(int i = 0; i < ctx.ID().size(); i++){
            stream.print(ctx.ID(i));
            if(i < ctx.ID().size() - 1) stream.print(", ");
        }
        return null;
    }

    @Override
    public Object visitCode(TKiKParser.CodeContext ctx) {
        return super.visitCode(ctx);
    }

    @Override
    public Object visitBody_element(TKiKParser.Body_elementContext ctx) {
        return super.visitBody_element(ctx);
    }

    @Override
    public Object visitBody(TKiKParser.BodyContext ctx) {
        for (TKiKParser.Body_elementContext body_el : ctx.body_element()) {
            visitBody_element(body_el);
        }

        if(ctx.return_statement() != null) visitReturn_statement(ctx.return_statement());
        indent -= 1;
        stream.print("\n");
        return null;
    }

    @Override
    public Object visitVariable_declaration(TKiKParser.Variable_declarationContext ctx) {
        printIndented(ctx.ID().getText() + " = ");
        if (ctx.variable() != null) visitVariable(ctx.variable());
        else if(ctx.expression() != null) visitExpression(ctx.expression());
        else{
            if(ctx.NATURAL() != null) stream.print("[0 for _ in range("+ctx.NATURAL().getText() + ")]");
            else if(ctx.LEFTBRACKET() != null) stream.print("[]\n");
            else if(ctx.type().getText().equals("string")) stream.print("\"\"");
            else if(ctx.type().getText().equals("char")) stream.print("\'\'");
            else if(ctx.type().getText().equals("bool")) stream.print("True");
            else stream.print("0");
        }
        stream.print("\n");
        return null;
    }

    @Override
    public Object visitDouble_operator(TKiKParser.Double_operatorContext ctx) {
        if(ctx.AND() != null) stream.print(" and ");
        else if(ctx.OR() != null) stream.print(" or ");
        else if(ctx.OR() != null) stream.print(" or ");
        else stream.print(" " + ctx.getText() + " ");
        return null;
    }

    @Override
    public Object visitSingle_operator(TKiKParser.Single_operatorContext ctx) {
        if(ctx.EXCLAMATION() != null) stream.print("not ");
        else if(ctx.MINUSMINUS() != null) stream.print(" -= 1");
        else if(ctx.PLUSPLUS() != null) stream.print(" += 1");
        return null;
    }

    @Override
    public Object visitStatement(TKiKParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitVariable(TKiKParser.VariableContext ctx) {
        if(ctx.NUMBER().size() == 1) stream.print(ctx.NUMBER(0).getText());
        else if (ctx.BOOLEAN() != null) stream.print(ctx.BOOLEAN().getText().substring(0,1).toUpperCase() + ctx.BOOLEAN().getText().substring(1));
        else if (ctx.TEXT() != null) stream.print(ctx.TEXT().getText());
        else if(ctx.COMMA() != null){
            stream.print("[");
            for(int i = 0; i < ctx.NUMBER().size()-1; i++)
                stream.print(ctx.NUMBER(i).getText() + ", ");
            stream.print(ctx.NUMBER(ctx.NUMBER().size()-1) + "]");
        }
        return null;
    }

    @Override
    public Object visitReturn_statement(TKiKParser.Return_statementContext ctx) {
        printIndented("return ");
        visitExpression(ctx.expression());
        stream.print("\n");
        return null;
    }

    @Override
    public Object visitIf_statement(TKiKParser.If_statementContext ctx) {
        printIndented("if ");
        visitExpression(ctx.expression(0));
        stream.print(":\n");
        indent++;
        visitBody(ctx.body(0));

        for(int i = 1; i < ctx.expression().size(); i++){
            printIndented("elif ");
            visitExpression(ctx.expression(i));
            stream.print(":\n");
            indent++;
            visitBody(ctx.body(i));
        }

        if(ctx.body().size() > ctx.expression().size()){
            printIndented("else:\n");
            indent++;
            visitBody(ctx.body(ctx.body().size()-1));
        }
        return null;
    }

    @Override
    public Object visitWhile_statement(TKiKParser.While_statementContext ctx) {
        printIndented("while ");
        if(ctx.expression() != null) visitExpression(ctx.expression());
        else stream.print("True");
        stream.print(":\n");
        indent++;
        visitBody(ctx.body());
        return null;
    }

    @Override
    public Object visitFor_statement(TKiKParser.For_statementContext ctx) {
        if(ctx.variable_declaration() != null){
            printIndented("for ");
            stream.print(ctx.variable_declaration().ID().getText());
            stream.print(" in range(");
            if(ctx.variable_declaration().variable() != null) stream.print(ctx.variable_declaration().variable().getText() + ", ");
            stream.print(ctx.expression(0).expression(1).variable().getText() + "):\n");
            indent++;
        }
        else{
            printIndented("while ");
            visitExpression(ctx.expression(0));
            stream.print(":\n");
            indent++;
            if(ctx.expression(1) != null){
                ctx.body().body_element().add(
                        (TKiKParser.Body_elementContext) ctx.expression(1).getParent());
            }
        }
        visitBody(ctx.body());
        return null;
    }

    @Override
    public Object visitExpression(TKiKParser.ExpressionContext ctx) {
        if(ctx.LEFTPAREN() != null && ctx.ID() != null){
            stream.print(ctx.ID().getText() + "(");
            if(ctx.expression() != null){
                visitExpression(ctx.expression(0));
                for(int i = 1; i < ctx.expression().size(); i++) {
                    stream.print(", ");
                    visitExpression(ctx.expression(i));
                }
            }
            stream.print(")");
        }
        else if(ctx.LEFTPAREN() != null){
            stream.print("(");
            visitExpression(ctx.expression(0));
            stream.print(")");
        }
        else if(ctx.SEMI() != null){
            printIndented("");
            visitExpression(ctx.expression(0));
            stream.print("\n");
        }
        else if(ctx.ID() != null){
            stream.print(ctx.ID().getText());
        }
        else if(ctx.variable() != null){
            visitVariable(ctx.variable());
        }
        else if(ctx.double_operator() != null){
            visitExpression(ctx.expression(0));
            visitDouble_operator(ctx.double_operator());
            visitExpression(ctx.expression(1));
        }
        else if (ctx.single_operator() != null) {
            if(ctx.single_operator().getText().equals("!")){
                visitSingle_operator(ctx.single_operator());
                visitExpression(ctx.expression(0));
            }
            else{
                visitExpression(ctx.expression(0));
                visitSingle_operator(ctx.single_operator());
            }
        }
        return null;
    }

    @Override
    public Object visitType(TKiKParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    private void printIndented(String text){
        for(int i = 0; i < indent; i++){
            stream.print("\t");
        }
        stream.print(text);
    }
}
