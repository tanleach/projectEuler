/*  
 *  Tanner Leach
 *  November 7, 2013
 *  sum of all even terms in a fibonacii sequence whose value does 
 *  not exceed four million.
 */

#include <iostream>

using namespace std;

int fibonacci(int);

int main(){
    
    //preloading the first two fib numbers and sums
    long int fib1 = 1;
    long int fib2 = 1;
    long int fibSum = 2;
    
    //loading the sum of the first even number fib.
    int evenSum = 2;

    while(fibSum <= 4000000){
        fib1 = fib2;
        fib2 = fibSum;
        fibSum = fib1 + fib2;

        //Only add sums if the fib value is even.
        if((fibSum % 2) == 0){
            evenSum += fibSum;
        }
    }

    cout << "Sum: " << evenSum << endl;

    return 0;

}

