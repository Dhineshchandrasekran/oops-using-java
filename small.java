import java.io.*;
class small
{
public static void main(String args[])
{
int [] arr = {10, 15, 5, 33, 19, 25};

int smallest = arr[0];

for (int i=0; i<arr.length; i++)
 {
    if (arr[i] < smallest) 
{
        smallest = arr[i];
    }
}
System.out.println("Smallest number in given array is: " + smallest);

int largest = arr[0];

for (int i=0; i<arr.length; i++) 
{
    if (arr[i] > largest)
 {
        largest = arr[i];
    }
}
System.out.println("Largest number in given array is: " + largest);
}
}