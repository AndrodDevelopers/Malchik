package lab10;

import java.util.Scanner;

public class primer12 {
		static Scanner in;
		static int[][] Input(int n, int m)
		{
			System.out.println("Vvedi razmer massiva");
			System.out.print("n= ");
			n=in.nextInt();
			System.out.print("m= ");
			m=in.nextInt();
			int [][] a= new int[n][m];
			for (int i=0; i<n;++i)
				for (int j=0; j<m; ++j)
				{
					System.out.printf("a[%d][%d]= ", i,j);
					a[i][j]=in.nextInt();
				}
			return a;
		}
		static void Print(int[][] a)
		{
			for (int i=0;i<a.length;++i,System.out.println())
				for (int j=0; j<a.length+1;++j)
					System.out.print(" "+ a[i][j]);
		}
		static void Change(int[][] a)
		{
			for (int i=0; i<a.length;++i)
				for (int j=0; j<a.length+1;++j) /* esli net +1 to ne
				vivodit posledniy element, po4emy? */
					if (a[i][j]>0) a[i][j] = -a[i][j];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		int n=0,m=0;
		int [][] mas=Input(n,m);
		System.out.println("ishodniy massiv:");
		Print(mas);
		Change(mas);
		System.out.println("Izmenenniy massiv: ");
		Print(mas);
	}

}
