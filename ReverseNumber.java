import java.io.*;
import java.util.*;
public class ReverseNumber
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sum=0,i=0;
    while(n > 0)
    {
      int a=n%10;
      sum=(sum*10)+a;
      n=n/10;
       i++;
    }
    System.out.println(sum);
  }
}
