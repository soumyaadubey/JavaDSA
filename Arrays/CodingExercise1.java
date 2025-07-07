import java.util.Arrays;

public class CodingExercise1 {
    public static int[] middle(int[] array) {
        
        if (array.length<3){
            return new int[0];
        }
        
        int[] middleArray= new int[array.length-2];
        for (int i=0; i<middleArray.length; i++){
            middleArray[i]=array[i+1];
        }
        
        return middleArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = middle(arr);
        System.out.println(Arrays.toString(result));
    }

}
