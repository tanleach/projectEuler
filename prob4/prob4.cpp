/*
 * @author Tanner Leach
 * 
 * projecteuler.net problem 4
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
#include <iostream>
#include <stdlib.h>
#include <stdio.h>

using namespace std;

class Product {
    private:
        int num1;
        int num2;
    public:
        //Construct with default 3 digit values.
        Product(int n1 = 100, int n2 = 100){
            num1 = n1;
            num2 = n2;
        }

        /*
         * @return the result of the Product's two numbers multiplied together.
         */
        int getProduct(){
            return num1*num2;
        }
        
        /*
         * @return <code>int</code> that is the product written backwards.
         */
        int getReverse(){
            int temp = getProduct();
            int rev = 0;
            while(temp != 0){
                rev     *= 10;
                rev     += (temp%10);
                temp    /= 10;
            }
            return rev;
        }

        /*
         * increase num1 by one
         */
        void increaseOne(){
            num1++;
        }

        /*
         * increase num2 by one
         */
        void increaseTwo(){
            num2++;
        }
        
        /*
         * @return Num1's value.
         */
        int getNumOne() {
            return num1;
        }

        /*
         * @return Num1's value.
         */
        int getNumTwo(){
            return num2;
        }

        /*
         * resets num2 back to 100 for looping.
         */
        void resetNumTwo(){
            num2 = 100;
        }

};

bool isPal(Product p);

int main(){
    //variable to store the lagest palindrome as we go.
    int largestPalindrome = 0;

    //new object
    Product prod;

    //outer loop only increasing num one once it had been mulitplies by 100-999.
    while(prod.getNumOne() < 1000){
        //loops through 100-999
        while(prod.getNumTwo() < 1000){
            //checks if the number is = forwards and back.
            if(isPal(prod)){
                int newPal = prod.getProduct();
                /*
                 * If the number is a palindrome then it is checked to see
                 * if it is larger than the previous palindrome.
                 */
                if(newPal > largestPalindrome)
                    largestPalindrome = newPal;
            }
            prod.increaseTwo();
        }
        //reset num2 to 100 before increasing num 1.
        prod.resetNumTwo();
        prod.increaseOne();
    }
    cout << "The Largest Palindrom Number is: " << largestPalindrome << endl;
}

bool isPal(Product p){
    int temp = p.getProduct();
    int pmet = p.getReverse();

    /*if(temp == pmet)
        return true;
    else
        return false;
    */
    //The comment above it the long way to do the preceding line.
    return (bool) !(temp-pmet);
}

