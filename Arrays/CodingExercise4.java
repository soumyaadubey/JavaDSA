public class CodingExercise4 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,6};
        System.out.println(findMissingNumberInArray(arr));
    }

    public static int findMissingNumberInArray(int[] arr) {
        int n=arr.length+1;
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int expectedSum = (n)*(n+1)/2;
        return expectedSum-sum;
    }
}
