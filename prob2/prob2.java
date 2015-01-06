/*
 * @author Tanner Leach
 *
 * Sum of all even-valued terms in a fibonacci sequence 
 * whose value does not exceed four million.
 */

public class prob2{

    //preloading the fib sequence
    public long fib1 = 1;
    public long fib2 = 1;
    public long fibSum = 2;

    //Loading the sum of the first even number fib.
    public long evenSum = 2;

    public String toString(){
        return "Fib. sum: " + evenSum;
    }

    public void getNextFib(){
        fib1    = fib2;
        fib2    = fibSum;
        fibSum  = fib1 + fib2;
    }

    /*
     * Keeps running sum of fib. numbers that are even.
     */
    public void addIfEven(){
        if((fibSum % 2) == 0)
            evenSum += fibSum;
    }

    /*
     * A getter for the fubSum()
     * @return <code>Long</code> fidSum
     */
    public long getSum(){
        return fibSum;
    }

    public static void main(String[] args){
        prob2 fibonacci = new prob2();
        
        while(fibonacci.getSum() <= 4000000){
            fibonacci.getNextFib();
            fibonacci.addIfEven();
        }
        System.out.println(fibonacci);
    }
}
