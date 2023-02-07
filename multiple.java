import java.util.*;
public class multiple

{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int i,mul=1 ;
for(i=2;i<=n;i++)
{

mul=mul*i;
}
System.out.println("The fact  numbers is "+mul);
}

}