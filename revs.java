import java.io.*;
import java.util.*;


class revs
{
public static void main(String args[])
{
int a,b,i,rem;
Scanner sc=new Scanner(System.in);


for(i=1;i<=1;i++)
{

System.out.println("Enter the number: ");
b=sc.nextInt();

if(b==0)
{

System.out.println("NEITHER ODD NOR EVEN");

}
else if(b<0)
{

System.out.println("NOT POSSIBLE");

}

else
{


while(b>0)
{
 
 rem=b%10;
 b=b/10;


if(rem%2==0)

{


System.out.println("EVEN");

}
else
{
  System.out.println("ODD");


}

}}}
}

}
