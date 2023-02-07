import java.util.*;
class negative
{
public static void main(String args[])
{
int n;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of inputs");
Scanner s=new Scanner(System.in);
n=s.nextInt();

int a[]=new int[n];

for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("the elements are");


for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(i=0;i<n;i++)
{
if(a[i]<0)
{
count++;
}
}
System.out.println(count);
for(i=0;i<n;i++)
{
if(a[i]>0)
{
count1++;
}
}
System.out.println(count1);
if(count>count1)
{System.out.println("true");}
else
{System.out.println("false");}



}
}