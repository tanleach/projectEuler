/*
 * @author Tanner Leach
 * @date April 9, 2015
 *
 * projecteuler.net problem 9
 * There exists exactly one Pythagorean triplet
 * for which a + b + c = 1000.
 * Find the product abc.
 */

public class PythagTriple{
    
    public static void main(String[] args){
        PythagTriple pt = new PythagTriple();
        pt.go();
    }

    public void go(){
        //finding increasing int(long) values for b
        for(long b = 1; b < 100; b++){
            //using b find a
            long a = findA(b);
            if(a != 0){
                if(findSum(a, b) == 1000){
                    long c = findC(a,b);
                    System.out.println(a*b*c);
                }
            }
        }
        System.out.println("~~~~~~~~~~");
    }

    /*
     * Solving the pythagorean theorem for 'a' in terms of 'b'
     * @param long b
     * @return long 'a', if a is an integer, will return
     * teh value of 'a', otherwise will return 0.
     */
    public long findA(long b){
        long a = (500000-1000*b) / (1000-b);

        if(a % 1 == 0){
            return (long)a;
        }

        return 0;
    }

    /*
     * using a & b, finds c and the sum of all three
     * @param long a, long b
     * @return sum of a+b+c as a <code>long</code>
     */
    public long findSum(long a, long b){
        long temp =  findC(a,b);
        long c = (long)temp;

        return a+b+c;
    }

    /*
     * using a^2 + b^2 = c^2 to solve for c
     * @param long a, long b
     * @returns c in the pythagorean theorem
     */
    public long findC(long a, long b){
        //Math.sqrt returns a double
        double temp = Math.sqrt((a*a) + (b*b));
        //cast the double to a long
        long c = (long)temp;
        return c;
    }








}
