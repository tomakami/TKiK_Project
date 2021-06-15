#include <iostream> 
#include <vector> 
using namespace std;
    
int main(int s){
	for (int i = 0; i < 10; i++) {
        i++;
    }


    int test = 1;
    bool flag = false;
    string str = "asdasd";
    int tablica[] = {1,2,3,4};

        if(flag && test){
            test = 2;
        } else if (test == true) {
            test = 3;
        } else {
            test = 4;
        }

        if(1 > 0 || test == 2) {
            test = 3 - 2;
        }

        while(test) {
            while(test > 0) {
                test--;
            }
            test++;
            test++;
        }

        while(flag == false) {
            flag = !flag;
        }

        int b = 2 + 3;

        if (b == 3) {
            b++;
            return b * 2;
        }


        int result = 1 + 7;
        z = 2 * 8;
        a = 6 - 1;
        x = 5 % a;
        x++;

        bool expresion = 1 && 1;

        bool expression2 = 0 || false;
        return 12 % b;
}

int greater(int i, int j) {
    if (i >= j) {
        return i;
    } else {
        return j;
    }
}