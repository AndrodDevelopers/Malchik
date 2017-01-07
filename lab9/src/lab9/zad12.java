package lab9;

import java.util.Scanner;

public class zad12 {
	static double max(double a, double b)
	{
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("x= ");
		double x=in.nextDouble();
		System.out.print("y= ");
		double y=in.nextDouble();
		double z=max(x,2*y-x)+max(5*x+3*y,y);
		System.out.println("maximalnoe= "+z);
	}

}
