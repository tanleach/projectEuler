import java.util.*;
import java.text.*;

public class MaxPath {

    private static final String FILE_NAME = "./pyramid.txt";

    public int[][] pyramid = new int[15][];
    
    public static void main(String[] args){
        MaxPath mp = new MaxPath();

        //Calculating only the time that it takes to calculate the max sum,
        //excludes the time it takes to read and reverse the array
        mp.readPyramidFile();

        long startTime = System.currentTimeMillis();
        int sum = mp.getMaxPath();
        long endTime = System.currentTimeMillis();
        System.out.println("MAX SUM PATH: " + sum);
        System.out.println("Total Time: " + (endTime - startTime) + " seconds");
    }

    public int getMaxPath() {
        int sum  = 0;

        /*
         * I must admit while I recognized a need for a 'bottom-up' algorithm,
         * I had to use outside help to realize that you need to calculate
         * mini 3-int triangles working towards the "point" of the larger pyramid
         */
        for (int row = 1; row < pyramid.length; row++) {
            for (int spot = 0; spot < pyramid[row].length; spot++) {
                int val1 = pyramid[row - 1][spot];
                int val2 = pyramid[row - 1][spot + 1];

                if (val1 > val2) {
                    pyramid[row][spot] += val1;
                } else {
                    pyramid[row][spot] += val2;
                }
            }
        }

        return pyramid[pyramid.length - 1][0];
    }
    
    public void readPyramidFile() {
        //Using FileReaderUtility.java
        FileReaderUtility fru = new FileReaderUtility();

        boolean loaded = fru.readFile(FILE_NAME);
        if(!loaded){
            System.err.println("Error loading file. Exiting...");
            System.exit(-9);
        }

        String temp;
        int idx = 0;
        while((temp = fru.getNextLine()) != null){

            //Make string arrays into integer arrays
            String[] tempVal = temp.split("\\s+");

            int[] tempArray = new int[tempVal.length];

            for (int i = 0; i < tempVal.length; i++) {
                tempArray[i] = Integer.parseInt(tempVal[i]);
            }
            pyramid[idx] = tempArray;
            idx++;
        }

        //flip the pyramid to work in a "bottom-up" fashion
        //(i.e reverse an array)
        for (int i = 0; i < pyramid.length / 2; i++) {
            int[] tempArray = pyramid[i];
            pyramid[i] = pyramid[pyramid.length - i - 1];
            pyramid[pyramid.length - i -1] = tempArray;
        }

        //print pyramid
        for (int[] pyr : pyramid) {
            System.out.println(Arrays.toString(pyr));
        }
    }
}
