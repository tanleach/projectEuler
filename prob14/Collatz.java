public class Collatz{
    private long startNum = 1000000;

    private int length;
    private long longestSeq; 

    public static void main(String[] args){
        Collatz coll = new Collatz();
        coll.find();
    }
    public void find(){
        for(long i = startNum; i > 0; i--){

            long tempNum = i;
            int tempLength = 0;

            while(tempNum > 1){
                tempLength++;
                if((tempNum % 2) == 1)
                    tempNum = oddNumber(tempNum);
                else
                    tempNum = evenNumber(tempNum);
            }

            if(tempLength > length){
                length = tempLength;
                longestSeq = i;
            }
        }

        System.out.println("The number sequence starts at: " + longestSeq);
    }

    public long evenNumber(long num){
        return num/2;
    }
    public long oddNumber(long num){
        return 3*num + 1;
    }
}
