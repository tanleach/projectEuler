/*
 * Tanner Leach
 * April 2, 2015
 *
 * Project Euler problem 13:
 * Work out the first ten digits of the sum of
 * the following one-hundred 50-digit numbers.
 * (stored in file 'largeSum.txt');
 */

import java.math.BigInteger;
public class LargeSum{

    //If you change the file name you must update this line
    private static final String FILE_NAME = "./largeSum.txt";

    public static void main(String[] args){

        LargeSum ls = new LargeSum();
        ls.go();
    }

    public void go(){
        BigInteger totalSum = BigInteger.ZERO;
        //Using FileReaderUtility.java
        FileReaderUtility fru = new FileReaderUtility();

        boolean loaded = fru.readFile(FILE_NAME);
        if(!loaded){
            System.err.println("Error loading file. Exiting...");
            System.exit(-9);
        }

        String temp;
        while((temp = fru.getNextLine()) != null){
            totalSum = totalSum.add(new BigInteger(temp));
        }

        System.out.println(getFirstTenDigits(totalSum));
    }

    public String getFirstTenDigits(BigInteger bigNum){

        //String we will build
        String firstTenDigits = "";
        //Taking the String representation of the BigInteger
        String tempString = String.valueOf(bigNum);
        //Split up the number to handle each "digit"

        /*
            Does the same amount of work as the 'return' statement
        char[] charArray = tempString.toCharArray();

        /
        for(int i = 0; i < 10; i++){
            firstTenDigits += String.valueOf(charArray[i]);
        }
        */


        return tempString.substring(0,10);
    }

}




















