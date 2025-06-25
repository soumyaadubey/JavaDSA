import java.util.Arrays;
public class SingleDimensionArray {
    int arr[]= null; 

    public void createArray(int sizeOfArray){
        arr= new int[sizeOfArray];
        for (int i=0; i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public void insertValue(int position, int valueInsert){
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

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray();
        sda.createArray(10);
        sda.insertValue(0, 10);
        sda.insertValue(1, 9);
        sda.insertValue(10, 10);

    }
}
