package lab10;

import java.util.Scanner;

public class zada4a3 {
	static Scanner in;
	static void Massiv(int[][] a)
	{
		for (int i=0; i<a.length;++i)
			for (int j=0; j<a.length; ++j)
			{
				System.out.printf("a[%d][%d]= ", i,j);
				a[i][j]=in.nextInt();
			}
	}
	static void Print(int[][] a)
	{
		for (int i=0;i<a.length;++i,System.out.println())
			for (int j=0; j<a.length;++j)
				System.out.print(" "+ a[i][j]);
				System.out.println();
	}
	static void Change1(int[][] a)
	{
		int k=0;
		int s=0;
		for (int i=0; i<a.length;++i)
			for (int j=0;j<i;++j)
				if (a[i][j]%2==0) {++k;s+=a[i][j];}
		if (k!=0){
		double sum=(double)s/k;
		System.out.println("Srednee arifmeticheskoe= "+ sum);
		}
		else System.out.println("0");
	}
	static void Change2(int[][] a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum+=a[i][a.length-i-1];
		}
		System.out.println("summa elementov na pobochnoi diogonali= "+sum);
	}
	static void Change3(int[][] a)
	{
		int k=0;
		int s=0;
		for (int i=0;i<a.length;i++)
			for (int j=0;j<a.length-i-1;j++)
			{
				if (a[i][j]!=0) {++k;s+=a[i][j];}
			}
		if (k!=0){
			double sum=(double) s/k;
			System.out.println("Srednee arifmeticheskoe nad pobochnoi diagonal= "+ sum);
			}
			else System.out.println("0");
	}
	static void Change4(int[][] a)
	{
		int k=0;
		int s=0;
		for (int i=0;i<a.length;i++)
			for (int j=a.length-i;j<a.length;j++)
			{
				++k;s+=a[i][j];
			}
		if (k!=0){
			double sum=(double) s/k;
			System.out.println("Srednee arifmeticheskoe pod pobochnoi diagonal= "+ sum);
			}
			else System.out.println("0");
	}
	static void Change5(int[][] a)
	{
		int k=0;
		for (int i=0; i<a.length;i++)
			for (int j=0;j<a.length/2;j++)
			{
				k=a[i][j];
				a[i][j]=a[i][a.length-j-1];
				a[i][a.length-j-1]=k;
			}
	}
	static void Change6(int[][] a)
	{
		int k=0;
		for (int i=0;i<a.length/2;i++)
			for (int j=0;j<a.length;j++)
			{
				k=a[i][j];
				a[i][j]=a[a.length-i-1][j];
				a[a.length-i-1][j]=k;
			}
	}
	static void Change7(int[][] a)
	{
		for (int i=0;i<a.length;i++)
		{
			if (i==0 & i%2==0)
			{
				for (int j=0;j<a.length;j++)
				{
					System.out.print(" "+a[i][j]);
				}
			}
			else {for (int j=0;j<a.length;j++)
				System.out.print(" "+a[i][a.length-j-1]);
			}
		}
	}
	static void Change8(int[][] a)
	{
		int t=0;
		int max= a[0][0];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0; j<a.length; j++)
			{
				if (max <= a[i][j])
				{
					t=j;
					max=a[i][j];
				}
				
			}
			a[i][t]=-a[i][t];
		}
	}
	static void Change9(int[][] a)
	{	
		int t=0;
		int s=0;
		int min= a[0][0];
		for (int i=0; i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if (min >= a[j][i])
				{
					s=i;
					t=j;
					min=a[j][i];
				}
			}
			a[t][s]=0;
		}
	}
	static void Change10(int[][] a)
	{
		System.out.println("Opredelit est li v dannom massive stroka tolko iz polojitelnih elementov ");
		int col=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if (a[i][j]>0) col+=1;
			}
			if (col==a.length) 
				{System.out.println("Est");col=0;}
			else {System.out.println("Nety");}
		}
	}
	public static void main(String[] args) {
		in=new Scanner(System.in);
		System.out.println("Vvedi razmer massiva: ");
		int n=in.nextInt();
		int [][] a=new int [n][n];
		Massiv(a);
		Print(a);
		System.out.print("(1-10)= ");
		int z=in.nextInt();
		switch (z)
		{
		case 1:
		{
			Change1(a);
		}
		break;
		case 2:
		{
			Change2(a);
		}
		break;
		case 3:
		{
			Change3(a);

		}
		break;
		case 4:
		{
			Change4(a);
		}
		break;
		case 5:
		{
			Change5(a);
			Print(a);
		}
		break;
		case 6:
		{
			Change6(a);
			Print(a);
		}
		break;
		case 7:
		{
			Change7(a);
		}
		break;
		case 8:
		{
			Change8(a);
			Print(a);
		}
		break;
		case 9:
		{
			Change9(a);
			Print(a);
		}
		break;
		case 10:
		{
			Change10(a);
			Print(a);
		}
		break;
		}
	}

}
