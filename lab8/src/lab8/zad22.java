package lab8;

import java.util.Scanner;

public class zad22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("k1= ");
		int k1=in.nextInt();
		System.out.print("m1= ");
		int m1=in.nextInt();
		System.out.print("k2= ");
		int k2=in.nextInt();
		System.out.print("m2= ");
		int m2=in.nextInt();
		if (k1%2 == k2%2 && m1%2 == m2%2 || k1%2 != k2%2 && m2%2 != m1%2)
		{
			System.out.println("odnogo cveta");	
			}
			else
				{
				System.out.println("raznie");
				}
	}

}
