import java.util.*;
class matrix1
{
public static void main(String args[])
{
int i,j;
int n,m;
System.out.println("enter the row num");
Scanner sc =new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter the col num");
m=sc.nextInt();
int a[][]=new int[n][m];
System.out.println("enter the array1 value");
for(i=0;i<n;i++)
{ 
for (j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}}
System.out.println("the matrix is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");

}
int b[][]=new int[n][m];
int c[][]=new int[n][m];

System.out.println("enter the array2 value");
for(i=0;i<n;i++)
{ 
for (j=0;j<m;j++)
{
b[i][j]=sc.nextInt();
}}
System.out.println("the matrix is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println(" ");

}

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
c[i][j]=a[i][j]-b[i][j];
}
}

System.out.println("the sum of array matrix");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{;
System.out.print(c[i][j]+" ");
}
System.out.println(" ");
}
}
}