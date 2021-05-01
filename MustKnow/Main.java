public class Main{
    
    public void logLn(Object o){
        System.out.println(o);
    }

    public void log(Object o){
        System.out.print(o);
    }
    
    public void printArr(int [] arr){
        logLn(arr[0]); //has one operation and takes constant time to run ===> O(1)
        logLn(arr[0]); //has two operation but still O(1)
    }

    /*
    small small will run fast but as the sample size increase e.g. 1,000,000 items then you will have it running slowly
    
    cost of algo: linear and is directly proportional to the size of the input therefore the runtime complexity O(n)
    */
    public void logging(int [] nums){
        for(int i=0; i<nums.length; i++){
            logLn(nums[i]);
        }
    }

    public static void main(String [] args){

    }
}