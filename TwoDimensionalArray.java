import java.util.Arrays;
public class TwoDimensionalArray {
    public static void main(String[] args) {
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


    }
    

}
