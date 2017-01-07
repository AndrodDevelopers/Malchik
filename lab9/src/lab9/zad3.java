package lab9;

public class zad3 {
	static void f(double x)
	{
		double y;
		if (x<1) y=Math.pow(Math.pow(x, 2)-1,2);
		else if (x>1) y=1/Math.pow(1+x, 2);
		else y=0;	
		System.out.printf("f(%.2f)=%.2f\n", x, y);
	}
	static void f(double x, double u)
	{
		double y=u=5;
		System.out.printf("f(%.2f)=%.2f\n", x, y);
	}
	public static void main(String[] args) {
		int a=5, b=0;
		f(a, b);
	}

}
