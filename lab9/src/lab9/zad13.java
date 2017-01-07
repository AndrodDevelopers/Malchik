package lab9;

import java.util.Scanner;

public class zad13 {
	static double func(double x)
	{
		return x=Math.pow(x, 3)-Math.sin(x);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("a= ");
		double a=in.nextDouble();
		System.out.print("b= ");
		double b=in.nextDouble();
		double z=Math.max(func(a),func(b));
		if 
		(func(a)> func(b))
				{
		System.out.println("max znachenie v to4ke A "+z);}
		else {
			System.out.println("max znachenie v to4ke B "+ z);}

	}

}
