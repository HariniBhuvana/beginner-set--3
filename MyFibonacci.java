import java.io.*;
import java.util.*;




public class MyFibonacci {
 
    public static void main(String a[]){
         
      Scanner s=new Scanner(System.in);
      int febcount=s.nextInt();
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < febCount; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< febCount; i++){
                 System.out.print(feb[i] + " ");
         }
    }
}
