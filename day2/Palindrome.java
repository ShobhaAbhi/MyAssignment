package Myassign.day2;

public class Palindrome {
	public static void main(String[] args) {
		int num = 123;
		int temp, sum=0;
		temp=num;
		for (; num!=0; num=num/10)
		{
			sum=sum*10+num%10;
		
		}
		
		if (temp==sum)
		{
			System.out.println("given number is palindrome");
		}
		else 
		{
			System.out.println("given number is not palindrome");
		}
	}	
	
}
