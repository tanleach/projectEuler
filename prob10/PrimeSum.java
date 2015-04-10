/*
 * @author Tanner Leach
 * @date April 10, 2015
 *
 * projectEuler.net Problem 10:
 * Find the sum for all prime numbers
 * less than 2,000,000.
 */

public class PrimeSum{
    //Upper bound of the primes
    public static final long LIMIT = 2000000;

    public static void main(String[] args){
        PrimeSum ps = new PrimeSum();    
        ps.iLoveYou();
    }

    //The "runner" of the program.
    public void iLoveYou(){
        //Pre-loaded with first 2 primes
        long sum = 5;

        for(long n = 5; n <= LIMIT; n += 2){
            //Only add if a prime number
            if(isPrime(n)){
                sum += n;
            }
        }

        System.out.println(
                "The sum of all primes under 2 million is:\n\t" + sum);
    }
    
    /*
     * Used from problem 7
     * @param <code>long</code> representing the potential prime
     * @return <code>boolean</code> whether or not n is prime.
     */
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
