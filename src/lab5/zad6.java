package lab5;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("¬ведите a ");
		float a=in.nextFloat();
		System.out.println("¬ведите b ");
		float b=in.nextFloat();
		System.out.println("¬ведите c ");
		float c=in.nextFloat();
		System.out.printf("(%.2f+%.2f)+%.2f=%.2f+(%.2f+%.2f)", a,b,c,a,b,c);
	}

}
