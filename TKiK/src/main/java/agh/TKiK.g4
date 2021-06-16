grammar TKiK;

entire_program
:   library+ using code;

library
:   INCLUDE ID GREATER;

using
:   USING NAMESPACE STD;

function
:   type ID LEFTPAREN argument? RIGHTPAREN body;

argument
:   type ID (COMMA type ID)*;

code
: function+;

body
: LEFTBRACE body_element* return_statement? RIGHTBRACE;

body_element
: statement
| expression;

variable_declaration
: type ID (LEFTBRACKET RIGHTBRACKET)? (ASSIGN (expression))? SEMI
| type ID (LEFTBRACKET NATURAL RIGHTBRACKET)? SEMI;

double_operator
: PLUS
| MINUS
| STAR
| DIV
| MOD 
| LESS
| AND
| OR
| GREATER 
| EQUALS 
| NOTEQUALS
| LESSEQUALS
| GREATEREQUALS
| DIVASSIGN
| MODASSIGN
| MULASSIGN
| ASSIGN;

single_operator
: PLUSPLUS
| MINUSMINUS
| EXCLAMATION;

statement
: for_statement
| if_statement
| while_statement
| variable_declaration;


variable
:   NUMBER
|   BOOLEAN
|   TEXT
|   LEFTBRACE (NUMBER (COMMA NUMBER)*)? RIGHTBRACE;

return_statement
:   RETURN expression SEMI;

if_statement
:   IF LEFTPAREN expression RIGHTPAREN body (ELSE IF LEFTPAREN expression RIGHTPAREN body)* (ELSE body)?;

while_statement
:   WHILE LEFTPAREN expression? RIGHTPAREN body;

for_statement
:   FOR LEFTPAREN (variable_declaration|SEMI) expression? SEMI expression? RIGHTPAREN body;

expression
:   ID LEFTPAREN (expression (COMMA expression)*)? RIGHTPAREN
|   LEFTPAREN expression RIGHTPAREN
|   expression double_operator expression
|   expression single_operator
|   single_operator expression
|   expression SEMI
|   variable
|   ID;

type
: BOOL
| CHAR
| DOUBLE
| FLOAT
| INT
| STRING
| VOID;


// TOKENY

BOOL:           'bool';
CHAR:           'char';
DOUBLE:         'double';
FLOAT:          'float';
INT:            'int';
STRING:         'string';
VOID:           'void';
BOOLEAN:        FALSE | TRUE;

FALSE:          'false';
TRUE:           'true';

BREAK:          'break';
CONTINUE:       'continue';
RETURN:         'return';

FOR:            'for';
ELSE:           'else';
IF:             'if';
WHILE:          'while';

USING:          'using';
INCLUDE:        '#include <';
NAMESPACE:      'namespace';
STD:            'std;';

LEFTPAREN:      '(';
RIGHTPAREN:     ')';
LEFTBRACKET:    '[';
RIGHTBRACKET:   ']';
LEFTBRACE:      '{';
RIGHTBRACE:     '}';
PLUS:           '+';
MINUS:          '-';
STAR:           '*';
DIV:            '/';
MOD:            '%';
ASSIGN:         '=';
LESS:           '<';
GREATER:        '>';
EQUALS:         '==';
NOTEQUALS:      '!=';
LESSEQUALS:     '<=';
GREATEREQUALS:  '>=';
PLUSPLUS:       '++';
MINUSMINUS:     '--';
DIVASSIGN:      '/=';
MODASSIGN:      '%=';
MULASSIGN:      '*=';
AND:            '&&';
OR:             '||'; 		
COMMA:          ',';
QUESTION:       '?';
EXCLAMATION:    '!';
COLON:          ':';
SEMI:           ';';
DOT:            '.';
QUOTE:          '"';


NUMBER:         MINUS? (NATURAL | (NATURAL DOT NATURAL));
ID:             [a-zA-Z_][0-9a-zA-Z_]*;
NONDIGIT:       [a-zA-Z_];
DIGIT:          [0-9];
NONZERODIGIT:   [1-9];
CHARACTER:      DIGIT|NONDIGIT;
TEXT:           QUOTE CHARACTER* QUOTE;
NATURAL:        [0] | ([1-9][0-9]*);


fragment SIGN:          [+-];
fragment Digitsequence: DIGIT ('\''? DIGIT)*;
WHITESPACE: [ \t]+ -> skip;
NEWLINE: ('\r' '\n'? | '\n') -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;
LINECOMMENT: '//' ~ [\r\n]* -> skip;
