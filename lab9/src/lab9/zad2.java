package lab9;

import java.util.Scanner;

public class zad2 {
	// variant 9
	static double f(double x)
	{
		double y;
		if (x<1) y=Math.pow(Math.pow(x, 2)-1,2);
		else if (x>1) y=1/Math.pow(1+x, 2);
		else y=0; 
		return y;
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("a= ");
		double a=in.nextDouble();
		System.out.print("b= ");
		double b=in.nextDouble();
		System.out.print("h= ");
		double h=in.nextDouble();
		for(double i=a; i<=b; i+=h)
			System.out.printf("f(%.2f)=(%.2f)\n", i , f(i));

	}

}
