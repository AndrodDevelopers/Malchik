package lab9;
import java.util.Scanner;
public class primer {
	
	static double min(double a, double b)
	{
		return (a<b) ? a:b;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("x= ");
		double x= in.nextDouble();
		System.out.print("y= ");
		double y=in.nextDouble();
		double z= min(3*x,2*y)+ min(x-y,x+y);
		System.out.println("z= " + z);
		
	}

}
