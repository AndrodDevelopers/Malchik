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
			int max=a[0][0];
			for (int i=0;i<a.length;i++)
			{
				for (int j=0;j<=a.length;j++)
				{
					if ((j>=i && j<=a.length-i-1) || (i>=j && j>=a.length-i-1))
					{
						if (a[i][j]>max) max=a[i][j];							
					}
				}
			}
			System.out.println("maximalniy element= " + max);
		}
		static void Change2(int[][] a)
		{
			int sum=0;
			for (int i=0;i<a.length;i++)
			{
				for (int j=0;j<a.length;j++)
				{
					if ((j<=i && j<=a.length-i-1) || (j>=i && j>=a.length-i-1))
					{
						sum+=a[i][j];
					}
				}
			}
			System.out.println("Summa elementov ravna= " + sum);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		System.out.print("Vvedi razmer massiva: ");
		int n=in.nextInt();
		int [][] a=new int[n][n]; 
		Massiv(a);
		Print(a);
		System.out.print("(1-2)= ");
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

