/*
 * @author Tanner Leach
 * @date Jan 4, 2015
 *
 * projecteuler.net problem 3:
 * Find the largest prime factor of the number 600851475143
 */

#include <iostream>
#include <math.h>
using namespace std;

int main(){

    //preload with given number
    long int startNum = 600851475143;
    
    //variable to hold current largest prime factor
    long int largest = 1;

    //setting to find if factor is prime
    bool prime = true;

    //Largest prime can be found within the square root of the number.
    for(int i = 3; i < sqrt(startNum); i+= 2){
        if((startNum % i) == 0){
            for(int j = 3; j < i; j+=2){
                if((i%j) == 0){
                    prime = false;
                    break;
                }
            }
            if(!prime){
                prime = true;
                continue;
            }
            largest = i;
        }
    }

    cout << "Largest prime = " << largest << endl;



}
