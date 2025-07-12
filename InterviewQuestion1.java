public class InterviewQuestion1 {
    public static void main(String[] args) {
        int[] numberArray={1,2,3,4,5};
        sumProductOfArray(numberArray);
    }
    //Time Complexity O(n)
    public static void sumProductOfArray(int[] array){
        int sum=0, product=1;
        for (int i=0; i<array.length; i++){
            sum+=array[i];
            product*=array[i];
        }
        System.out.println("Sum and product are "+sum+" "+product+" respectively");
    }
}
