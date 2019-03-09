import java.util.Scanner;

public class TestClass {
   
   public static int prime(num){
       if(num==0||num==1)
       return 0;
       else{
           for(int i=2;i<num;i++){
               if(num%i==0)
               return 0;
           }
        return 1;   
       }
   }
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();                 // Reading input from STDIN
            // Writing output to STDOUT
            String output="";
            for (int i =0 ;i<=num;i++){
               if(prime(i)!=0)
               output=i+" ";
            }
        System.out.print(output);
        System.out.println();

        // Write your code here

    }
	
}
