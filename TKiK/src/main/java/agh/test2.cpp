#include <iostream>
using namespace std;

void print_array(int tab, int n, string name){
	cout<<name<<"TEXT"<<endl;
	for (int i=0;i<n;i++) {
		cout<<i<<"aa"<< tab <<endl;
	}
}

int main(){
    int tab1 [4];
    // 10 15 20 40
    tab1[0] = 10;
    tab1[1] = tab1[0]+5;
    tab1[2] = 10*2;
    tab1[3] = 80/2;
    print_array(tab1,4,"tablica bez inicjalizacji");
    // 180 360 720
    int tab2[] = {180, 2*180, 4*180};
    print_array(tab2,3,"tablica z inicjalizacja");
}