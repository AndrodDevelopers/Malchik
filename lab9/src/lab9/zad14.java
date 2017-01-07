package lab9;

import java.util.Scanner;

public class zad14 {
	static double func(double x)
	{
		return x=Math.cos(2*x)+Math.sin(x-3);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("a= ");
		double a=in.nextDouble();
		System.out.print("b= ");
		double b=in.nextDouble();
		double z=Math.min(func(a),func(b));
		if 
		(func(a)< func(b))
			{
			System.out.println("min znachenie v to4ke A="+ z);
			}
		else 
			{
			System.out.println("min znachenie v to4ke B="+ z);
			}

	}

}
