import java.io.*;
import java.util.*;
class Primefactor
{
public static void main(String[] args) 
{
		int number = 24;
		
		for(int i=2; i<=number; i++)
{
			while(number%i == 0)
{
				System.out.println(i);
				number = number/i;
			}
		}
	}
}