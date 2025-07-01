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

    public static void accessCell(int row, int col){
        System.out.println("Accessing row "+ row+" and column "+col);
        try {
            System.out.println(arr[row][col]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index entered");
        }
        
    }

    public static void traverseArray(){
        try {
            for (int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array does not exist");
        }
    }

    public static void searchArray(int value){
        for (int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    if (arr[i][j]==value){
                        System.out.println("Value found at index "+i+" "+j );
                        return;
                    }

                }
            }
        System.out.println("Value not found");
    }

    public static void deleteIndex(int row, int col){
        try {
            arr[row][col]=Integer.MIN_VALUE;
            System.out.println("Value successfully deleted. Current array is "+Arrays.deepToString(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
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
    createArray(2, 2);
    insertValue(0, 0, 10);
    insertValue(0, 1, 20);
    insertValue(1, 0, 100);
    insertValue(1, 1, 200);
    //Accessing an element requires O(1) time complexity
    accessCell(0, 1);

    traverseArray();

    searchArray(2000);

    deleteIndex(0, 0);

    }
    

}