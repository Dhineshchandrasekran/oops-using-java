import java.util.*;
class T2
{
public static void main(String args[])
{
int i,j,min,max,count=1;
Scanner s=new Scanner(System.in);
int n=s.nextInt();

int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}

for(i=0;i<n-1;i++)
{ 
min=a[i];
max=a[i+1];
if(min>max)
{
count++;
}
}
System.out.println("The no of group is "+count);
}
}