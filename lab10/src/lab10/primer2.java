package lab10;
import java.util.Scanner;
public class primer2 {
		static Scanner in;
		static int[][] Input(int n)
		{
			System.out.println("Vvedi razmer massiva");
			System.out.print("n= ");
			n=in.nextInt();
			int [][] a= new int[n][n];
			for (int i=0; i<n;++i)
				for (int j=0; j<n; ++j)
				{
					System.out.printf("a[%d][%d]= ", i,j);
					a[i][j]=in.nextInt();
				}
			return a;
		}
		static void Print(int[][] a)
		{
			for (int i=0;i<a.length;++i,System.out.println())
				for (int j=0; j<a.length;++j)
					System.out.print(" "+ a[i][j]);
		}
		static double Rezalt(int[][] a)
		{
			int k=0;
			double s=0;
			for (int i=0; i<a.length;++i)
				for (int j=i+1;j<a.length;++j)
					if (a[i][j]%2!=0) {++k;s+=a[i][j];}
			if (k!=0) return s/k;
			else return 0;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		int n=0;
		int [][] mas=Input(n);
		System.out.println("Ishodniy massiv: ");
		Print(mas);
		double rez=Rezalt(mas);
		System.out.println("Srednee arifmeticheskoe = " + rez);
	}

}
