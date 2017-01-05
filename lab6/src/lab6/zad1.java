package lab6;
import java.util.Scanner;
public class zad1 {

	public static void main(String[] args) {
		// Variant 2
		Scanner in= new Scanner(System.in);
		System.out.println("b= ");
		double b= in.nextDouble();
		double z1,z2;
		z1= Math.sqrt(2*b+2*Math.sqrt(Math.pow(b, 2)-4))/(Math.sqrt(Math.pow(b, 2)-4)+b+2);
		z2=	1/Math.sqrt(b+2);	
		System.out.println("z1= " +z1 +  "\nz2= "+z2);
	}

}
