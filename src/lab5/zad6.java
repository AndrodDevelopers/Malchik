package lab5;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("������� a ");
		float a=in.nextFloat();
		System.out.println("������� b ");
		float b=in.nextFloat();
		System.out.println("������� c ");
		float c=in.nextFloat();
		System.out.printf("(%.2f+%.2f)+%.2f=%.2f+(%.2f+%.2f)", a,b,c,a,b,c);
	}

}
