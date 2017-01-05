package lab6;

import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.print("x= ");
		float x= in.nextFloat();
		System.out.print("y= ");
		float y=in.nextFloat();
		if (x*x+y*y<9 && y>0)
			System.out.println("Vnutri");
		else if (x*x+y*y>9 || y<0)
			System.out.println("vne");
		else 
			System.out.println("granica");
	}

}
