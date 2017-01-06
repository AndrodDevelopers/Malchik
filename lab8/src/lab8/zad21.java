package lab8;
import java.util.Scanner;
public class zad21 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("k= ");
		int k=in.nextInt();
		System.out.print("m= ");
		int m=in.nextInt();
		if (k%2 == 0 && m%2 ==1 || k%2 ==1 && m%2==0)
		{
		System.out.println("White");	
		}
		else
			{
			System.out.println("black");
			}
	}

}
