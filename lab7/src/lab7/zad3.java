package lab7;
import java.util.Scanner;
public class zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("a= ");
		float a=in.nextFloat();
		System.out.print("b= ");
		float b=in.nextFloat();
		if (a>b) System.out.println("Vvedite a<=b");
		else
		{
		for (float x=b;x>=a; x--)
		{ 
			System.out.println(" "+ Math.pow(x, 3));
		} 
		System.out.println("while");
		float y=b;
		while (y>=a)
		{
			System.out.println(" "+ Math.pow(y, 3));
			y--;
		}
		System.out.println("do while");
		do
		{
		System.out.println(" "+ Math.pow(b, 3));
		b--;
		}
		while (b>=a);
		}
	}

}
