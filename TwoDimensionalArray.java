import java.util.Arrays;
public class TwoDimensionalArray {
    static int arr[][]=null;

    public static void createArray(int rows, int cols){
        arr = new int[rows][cols];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }

    public static void insertValue(int row, int col, int value){
        if (arr == null) {
        System.out.println("Array is not initialized.");
        return;
        }
        try{
            if (arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println("Value inserted");
                System.out.println(Arrays.deepToString(arr));
            } else{
                System.out.println("Array cell already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index cannot be accessed");
        }
    }







    public static void main(String[] args) {
    /* 
    //Declare
    int[][] int2Darr;
    //Instantiate
    int2Darr= new int[2][2];
    //Initialize
    int2Darr[0][0]=1;
    int2Darr[0][1]=2;
    int2Darr[1][0]=3;
    int2Darr[1][1]=4;
    //This take O(mn) time complexity

    //We use a unique function to print 2DAarray to console
    System.out.println(Arrays.deepToString(int2Darr));

    String s2DArray[][]={{"a","b"},{"c","d"}};
    //This takes O(1) time complexity
    System.out.println(Arrays.deepToString(s2DArray));

    */

    insertValue(1, 3, 300);

    }
    

}
