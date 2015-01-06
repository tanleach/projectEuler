/*
 * @author Tanner Leach
 * @date 1-5-13
 *
 * projectEuler.net Problem 5:
 *  What is the smallest positive number that is evenly divisible 
 *  by all of the numbers from 1 to 20?
 */
//20: 10,5,4,2
//15: 3
#include <iostream>

using namespace std;

int main(){

    //keep track of waht number we are at.
    int starOfShow = 20;

    //flag to help control the <code>while</code> loop.
    bool notDivisible = true;

    //checks to see if divisble by 11-19
    while(notDivisible){
        if((starOfShow % 11) != 0){
            starOfShow += 20;
            continue;
        }
        if((starOfShow % 12) != 0){
            starOfShow += 20;
            continue;
        }
        if((starOfShow % 13) != 0){
            starOfShow += 20; continue;
        }
        if((starOfShow % 14) != 0){
            starOfShow += 20;
            continue;
        }
        if((starOfShow % 15) != 0){
            starOfShow += 20;
            continue;
        }
        if((starOfShow % 16) != 0){
            starOfShow += 20;
            continue;
        }
        if((starOfShow % 17) != 0){
            starOfShow += 20;
            continue;
        }
        if((starOfShow % 18) != 0){
            starOfShow += 20;
            continue;
        }
        if((starOfShow % 19) != 0){
            starOfShow += 20;
            continue;
        }

        //'break' the loop
        notDivisible = false;
    }
    //print the result.
    cout << starOfShow << endl;

}
