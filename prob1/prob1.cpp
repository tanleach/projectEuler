/*
    Tanner Leach
    November 1, 2013
    Will calculate sum of all multiples of 3 & 5 from 0 to 1000.
*/

#include <iostream>
using namespace std;

int main(){

    int sum = 0;
    int lowRange = 1;
    int upRange = 1000;

    for (int i = lowRange; i < upRange; i++){
        if ( ((i % 3) == 0) || ((i % 5) == 0))
            sum = sum + i;
    }

    cout << "The sum is: " << sum << endl; 
    
    return 0;
}

