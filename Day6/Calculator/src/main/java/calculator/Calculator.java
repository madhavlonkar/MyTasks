package calculator;

public class Calculator {
	
	public int sum(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.print("Sum is :"+c.sum(10,20));
	}
}
