package lab12;
import java.util.Scanner;
public class zada4a1 {
		static Scanner in;
		static void Massiv(int [][] a)
		{
			for (int i=0; i<a.length; i++)
				for (int j=0;j<a.length;j++)
				{
					System.out.printf("a[%d][%d]= ", i,j);
					a[i][j]=in.nextInt();
				}
		}
		static void Print(int[][] a)
		{
			for (int i=0;i<a.length;i++,System.out.println())
				for (int j=0;j<a.length;j++)
					System.out.print(" " + a[i][j]);
					System.out.println();
		}
		static void Change1(int [][] a)
		{
			for (int i=0;i<a.length;i++)
			{
				for (int j=0;j<=a.length;j++)
				{
					if ( )
				}
			}
		}
		static void Change2(int[][] a)
		{
			for (int i=0;i<a.length;i++)
			{
				for (int j=0;j<a.length;j++)
				{
					if ()
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		System.out.print("Vvedi razmer massiva: ");
		int n=in.nextInt();
		int [][] a=new int[n][n]; 
		Massiv(a);
		Print(a);
		System.out.print("(1-10)= ");
		int z=in.nextInt();
		switch (z)
		{
		case 1:
		{
			Change1(a);
			Print(a);
		}
		break;
		case 2:
		{
			Change2(a);
			Print(a);
		}
		break;
		}
	}
}

