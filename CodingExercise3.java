import java.util.Arrays;

public class CodingExercise3 {
  public static int[] findTopTwoScores(int[] array){
    int[] topNumbers= new int[2];
    int topScore=Integer.MIN_VALUE;
    int topScore2=Integer.MIN_VALUE;
    for (int i=0; i<array.length; i++){
        if (array[i]>topScore){
            topScore=array[i];
        }
    }
    for (int i=0; i<array.length; i++){
        if (array[i]>topScore2 && array[i]<topScore){
            topScore2=array[i];
        }
    }
    topNumbers[0]=topScore;
    topNumbers[1]=topScore2;
    return topNumbers;
  }

  public static void main(String[] args) {
    int[] arr= null;
    System.out.println(Arrays.toString(findTopTwoScores(arr)));
  }


}
