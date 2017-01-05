package lab6;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		// Variant 9
		Scanner in= new Scanner(System.in);
		System.out.print("Vvedi vozrast= ");
		double a= in.nextDouble();
		if (a<0) System.out.println("ne rodilsya ewe");
		else if (a>=0 && a<1) System.out.println("mladenec");
		else if (a>=1 && a<=11) System.out.println("rebenok");
		else if (a>=12 && a<=15) System.out.println("podrostok");
		else if (a>=16 && a<=25) System.out.println("unosha");
		else if (a>=26 && a<=70) System.out.println("myjik");
		else System.out.println("starik");
	}

}
