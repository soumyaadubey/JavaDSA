import java.util.*;
public class ArrayProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.print("How many days' temperature? ");
         int numDays= scan.nextInt();
         int[] temps = new int[numDays];
         int sum=0;
         for (int i=0; i<numDays; i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            temps[i] = scan.nextInt();
            sum+=temps[i];  
         }

         int above=0;

         double average = sum/numDays;
         for (int i=0; i<numDays; i++){
            if (temps[i]>average){
                above++;
            }
         }
         System.out.println();
         System.out.println("Average Temperature: "+average);
         System.out.println("Number of days above average: "+above);
         
        scan.close();
    }
    
}
