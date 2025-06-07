public class Complexity{
    
    public static void num(int n){
        int counter=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                counter++;
                System.out.println(i+" "+j);
            }
        }
        for (int k=0;k<n;k++){
            counter++;
            System.out.println(k);

        }
        System.out.println(counter);
        
    }
    public static void main(String[] args) {
        num(10);

        


    }
}