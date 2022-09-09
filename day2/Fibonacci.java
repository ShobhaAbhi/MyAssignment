package Myassign.day2;
//Assignment(Array:1):Fibonacci
public class Fibonacci {

	public static void main(String[] args) {
		int range=8, sum;
		int firstNum=0, secNum = 1;
		System.out.println(firstNum);
		for(int i=2; i<range; i++)
		{
			sum= firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
			
		}
	}

}
