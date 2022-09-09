package Myassign.day2;

public class PalindromeNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2232;
		int rev=0;
		int temp;
		temp=num;
		for (;num!=0;num=num/10)
		{
			rev=rev*10+num%10;
		
		}
		if(temp==rev)
		{
			System.out.println("given number is a palindrome");
		}
		else {
			System.out.println("given number is not a palindrome");
		}
	}

}
