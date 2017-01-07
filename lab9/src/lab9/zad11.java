package lab9;

import java.util.Scanner;

public class zad11 {
	static double min(double a, double b)
	{
		return (a<b) ? a:b;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("x= ");
		double x=in.nextDouble();
		System.out.print("y= ");
		double y=in.nextDouble();
		System.out.print("z= ");
		double z=in.nextDouble();
		System.out.print("v= ");
		double v=in.nextDouble();
		double little=min(min(x,y),min(z,v));
		System.out.println("minimalnoe= " + little);
	}

}
