import java.util.*;
class baloon
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Array elements ");
for(int i=0;i<n;i++)
{ 
a[i]=sc.nextInt();  
}
System.out.println("Target= ");
int t=sc.nextInt();
for(i=0;i<n;i++)
{ 
if(a[i]==t)
{
k=i;
flag=1;
break;
}  
else
flag=0;
}
if (flag==1)
System.out.println(k);
else
System.out.println("-1");


}
}