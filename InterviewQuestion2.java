public class InterviewQuestion2 {
    public static void main(String[] args) {
        int[] numberArray={1,2,3,4,5};
        printPairs(numberArray);
    }
    //Time Complexity O(n^2)
    public static void printPairs(int[] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                System.out.print(array[i]+""+array[j]+", ");
            }
            System.out.println();
        }
    }
}
