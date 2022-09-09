package Myassign.day2;
//Assignment:3,Convert a negative number to positive number
public class ConvertPositive {

	public static void main(String[] args) {
	int a = -40;
	if (a<0)
	{
		System.out.println("a is a negative number");
		a = -(a);
		System.out.println("Converted a negative number to positive number " +a);	
	}
	else 
	{
		System.out.println("a is a positive number");
	}
}
}
