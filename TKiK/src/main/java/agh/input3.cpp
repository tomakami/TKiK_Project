#include <iostream>
using namespace std;

int foo(int n)
{
    int a = n % 2;
    int b = n / 2;
    int c = a * b;
	return c;
}

int main()
{
	int n = 10;

	int x = foo(n);

	return x;
}