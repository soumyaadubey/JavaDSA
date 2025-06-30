import java.util.Arrays;
public class SingleDimensionArray {
    static int arr[]= null; 

    public static void createArray(int sizeOfArray){
        arr= new int[sizeOfArray];
        for (int i=0; i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public static void insertValue(int position, int valueInsert){
        try{
            if (arr[position]==Integer.MIN_VALUE){
                arr[position]=valueInsert;
                System.out.println("Value inserted");
                System.out.println(Arrays.toString(arr));
            } else{
                System.out.println("Position already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index cannot be accessed");
        }
    }

    //Array Traversal

    public static void traverseArray(){
        try{
            for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        } catch(Exception e){
            System.out.println("Array does not exist");
        }
        
    }

    //Search for an element in an array

    public static void searchArray(int valueToSearch){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==valueToSearch){
                System.out.println("Value is found at " + i);
                return;
            }
        }
        System.out.println("Value not found");
    }

    //Delete Value at index

    public static void deleteIndex(int indexToDelete){
        try{
            arr[indexToDelete]=Integer.MIN_VALUE;
            System.out.println("Value successfully deleted. Current array is "+Arrays.toString(arr));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Plese enter a valid index");
        }
    }

    public static void main(String[] args) {
        //Creating array is O(n) time complexity
        createArray(3);
        insertValue(0, 10);
        insertValue(1, 9);
        insertValue(2, 10);
        // Accessing element of array is O(1) space and time complexity
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        //Traversing an array has O(n) time complexity and O(1) space complexity
        System.out.println("Traverse Array");
        traverseArray();
        //Searching an array has O(n) time complexity and O(1) space complexity
        searchArray(100);
        //Deleting an element has O(1) time complexity and O(1) space complexity
        deleteIndex(0);

    }
}
