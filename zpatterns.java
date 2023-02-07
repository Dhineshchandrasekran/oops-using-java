import java.io.*;
import java.util.*;
class zpatterns
{
public static void main(String args[])
{

int n=5;
int i,j;
for(i=1;i<=n;i++,System.out.print("\n"))
{
for(j=1;j<=n+1;j++)
{
if(i==1||i==n)
{
System.out.print("@");
}
else if((j==n || j==n+1) && i==n-3)
{
System.out.print("#");
}
else if((j==n-1 || j==n-2)&& i==n-2)
{
System.out.print("#");
}
else if((j==n-3 || j==n-4)&& i==n-1)
{
System.out.print("#");
}
else
{
System.out.print(" ");
}
}
}
}
}