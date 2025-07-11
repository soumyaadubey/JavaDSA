import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringarrlist= new ArrayList<String>(Arrays.asList("adam","eve"));
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,30,20,60,70,80));

        //Adding elements in ArrayList
        numbers.add(50);
        numbers.add(40);
        System.out.println(numbers);
        stringarrlist.add("lilith");
        stringarrlist.add(1,"lucifer");
        System.out.println(stringarrlist );

        //Accessing elements in arraylist
        System.out.println(stringarrlist.get(2));

        //Traversing an arraylist
        //for loop
        for (int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        //for each loop
        for (int i: numbers){
            System.out.println(i);
        }
        //iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //Searching an element





    }
}
