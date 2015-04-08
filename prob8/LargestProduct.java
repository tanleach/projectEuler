/*
 * @author Tanner Leach
 * April 8, 2015
 *
 * Project Euler problem 8:
 * Find the 13 adjacent digits in the 
 * 1000-digit number (./numberSeries.txt)
 * that have the greatest product. 
 * What is the value of this product?
 */

import java.util.*;

public class LargestProduct{
    /*
     * If you change the file name of the 1000
     * digit number you must update this line.
     */
    private static final String FILE_NAME = "./numberSeries.txt";

    private long largestProduct;
    private ArrayList<Integer> ints;

    public static void main(String[] args){
        LargestProduct lp = new LargestProduct();
        lp.loadIntegers();
        lp.findLargestProduct();

        System.out.println("** " + lp.getLargestProduct());
    }

    private long getLargestProduct(){
        return this.largestProduct;
    }

    public void loadIntegers(){

        //Using ./FileReaderUtility.java
        FileReaderUtility fru = new FileReaderUtility();

        boolean loaded = fru.readFile(FILE_NAME);

        if(!loaded){
            System.err.println("Error reading file. Exiting...");
            System.exit(-1);
        }

        String tempString;
        if((tempString = fru.getNextLine()) != null){
            System.out.println(tempString.length());
        }

        ints = new ArrayList<Integer>();

        for(String x : tempString.split("")){
            ints.add(Integer.valueOf(x));
        }

        /*for(int i = 0; i < tempString.length()/20; i++){
            System.out.println(ints.get(i));
        }
        */

    }
    
    private void findLargestProduct(){
        
        long tempProduct = 1;
        int numCount = 0;

        //Find the largest sum of 13 adjacent digits
        for(int start = 0, end = 13; end <= ints.size(); start++, end++){
            for(int i = start; end-i > 0; i++){
                int intVal = ints.get(i);
                System.err.println(intVal);
                tempProduct *= intVal;
                numCount++;
            }
            if(tempProduct > largestProduct){
                largestProduct = tempProduct;
            }
            System.err.println(numCount);
            tempProduct = 1;
            numCount = 0;
        }
    }

}
