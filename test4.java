import java.io.*;
import java.util.*;
class test4
{
public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
 int i;
for(i=0;i<=n.length;i++)
{
if  (n/2==0)
{
System.out.print(1);
}
else if(n/2==1)
{
System.out.print(0);
}
else
{
int x=10^9+7;
System.out.print(x);
}
System.out.println(" ");
}
}
}
