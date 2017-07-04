import java.io.*;
import java.util.*;
public class Hcf
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int t,hcf=0;
int a=s.nextInt();
int b=s.nextInt();
int x=a;
int y=b;
while(y!=0)
{
t=y;
y=x%y;
x=t;
}
hcf=x;
System.out.println(hcf);
}
}
