/*
 * @author Tanner Leach
 * April 7, 2015
 * 
 * projecteuler.net
 * Problem 7
 * What is the 1001st prime number?
 */

import java.util.*;


public class Prime1001{

    //Determines the 'n-th' prime number.
    public static final int LIMIT = 10001;

    //ArrayList to hold the Prime numbers
    private ArrayList<Long> primes;

    public static void main(String[] main){
        Prime1001 primeNum = new Prime1001();
        primeNum.go();
    }

    public void go(){
        primes = new ArrayList<Long>();
        primes.add((long)2);

        //Stops once it finds the desired number of primes.
        for(long num = 3; primes.size() < LIMIT; num += 2){
            if(isPrime(num)){
                primes.add(num);
        //Uncomment to  see the size of the ArrayList
        //Printed to the console as primes are added.
                System.out.println(primes.size());
            }
        }

        //Reveals the last item in the list
        System.out.println(primes.get(primes.size() - 1));
    }

    boolean isPrime(long n) {
        //If you give it an even number, its false
        if(n%2 == 0) return false;

        //the beauty with primes
        long sqrtN = (long)Math.sqrt(n)+1;

        //starts at 3 and only checks odd numbers.
        for(long i = 3; i <= sqrtN; i += 2) {
            if(n % i == 0) return false;
        }

        //Only gets here if it passes all the tests.
        return true;
    }
}
