#include <iostream>;
#include <cmath>;
using namespace std;
int convertbinarytodecimal(int n) {
    int binary;
    cin>> binary;
    int x=0;
    int decimal = 0;
    for (int i = 0; binary>0;i++) {
        int remainder = binary % 10;
        decimal += remainder * pow(2, i);
        binary /= 10;
    }
    return decimal;
}
int convertdecimaltobinary(int n) {
///division method
int decimal;
cin >> decimal;
int binary = 0;
int x;
for (int i = 0; decimal>0;i++) {
    decimal /= 2;
    x = decimal % 2;
    binary += x * pow(10, i);
}
return binary;
}                    
int main() {
    int n;
    cout << "Enter a binary number:" <<convertbinarytodecimal(n);
    cout << "Enter a decimal number:" << convertdecimaltobinary(n);
    return 0;
}