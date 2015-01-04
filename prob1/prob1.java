/*
 * @author Tanner Leach
 *
 * projectEuler.net Problem 1
 *  Find the sum of all multiples of 3 or 5
 *  below 1000
 */

public class prob1{
    //Initializing variables
    public int sum = 0;
    public int lowRange = 1;
    public int upRange  = 1000;

    public String toString(){
        return "The sum is: " + findSum();
    }

    public int findSum(){
        for(int i = lowRange; i < upRange; i++){
            if(((i%3)==0) || ((i%5) == 0))
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        prob1 p1 = new prob1();
        System.out.println(p1);
    }

}
