public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("List of Armstrong numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            int number = i;
            int result = 0;
            int remainder;

            while (number > 0) {
                remainder = number % 10;
                result = result + remainder * remainder * remainder;
                number = number / 10;
            }
            if (result == i) {
                System.out.println(i);
            }
else 
{
System.out.println("non Armstrong "+i);
        }
    }
}