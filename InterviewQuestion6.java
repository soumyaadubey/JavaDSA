import java.util.Arrays;
public class InterviewQuestion6{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverseArray(arr);
    }

    public static void reverseArray(int[] array){
        int[] reversedArr;
        reversedArr= new int[array.length];

            for (int j=0; j<array.length; j++){
                reversedArr[j]=array[array.length-1-j];
            }

        System.out.println("Original Array: "+Arrays.toString(array));
        System.out.println("Reversed Array: "+Arrays.toString(reversedArr));
    }
}