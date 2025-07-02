public class CodingExercise2 {
      public static int sumDiagonalElements(int[][] array) {
        int diagonal=0;
        for (int i=0; i<array.length; i++){
          diagonal+=array[i][i];
        }
        return diagonal;
    }

    public static void main(String[] args) {
      int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
      int n= sumDiagonalElements(arr);
      System.out.println(n);
    }
}
