public class Complexity{
    
    public static void num(int n){
        int counter=0;
        for (int i=0;i<n;i++){
            
            for (int j=0;j<n;j++){
                counter++;
                System.out.println(i+" "+j);
                
            }
        System.out.println(counter);
        }
    }
    public static void main(String[] args) {
        num(100);

    }
}