import java.util.*;
class nodd
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int i,sum=0;
for(i=1;i<=n;i++)
{
  if((i%2)!=0)
{
sum=sum+i;
}
}
System.out.println("The sum odd  numbers is "+sum);
}

}