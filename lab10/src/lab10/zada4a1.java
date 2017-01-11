package lab10;
import java.util.Scanner;
public class zada4a1 {
		static Scanner in;
		static void Massiv(int[] a)
		{
			for (int i=0; i<a.length; i++)
			{
				System.out.printf("a[%d]= ", i);
				a[i]=in.nextInt();
			}
		}
		static void Print(int[] a)
		{
			for (int i=0; i<a.length; i++)
				System.out.printf("%d ", a[i]);
				System.out.println();
		}
		static void Change1(int[] a)
		{
			System.out.print("x=");
			int x=in.nextInt();
			System.out.print("y=");
			int y=in.nextInt();
		for(int i = 0; i<a.length;i++)
			if (a[i] >= x && a[i]<= y)
			{
				a[i]=0;
			}
		}
		static void Change2(int[] a)
		{
			for (int i=0;i<a.length; i++)
				if (a[i]<0 && a[i]%3!=0)
				a[i]=-a[i];	
		}
		static void Change3(int[] a)
		{
			System.out.print("x=");
			int x=in.nextInt();
			for (int i=0;i<a.length; i++)
				if (a[i]<x)
				{
					a[i]*=2;
				}
		}
		static void Change4(int[] a)
		{
			double sum=0;
			for (int i=0;i<a.length; i++)
				sum+=a[i];
				System.out.println("srednee= "+ sum / 5);
		}
		static void Change5(int[] a)
		{
			double sum=0;
			for (int i=0;i<a.length; i++)
				if(a[i]<0)
				{
					sum+=a[i];
				}
			System.out.println("srednee= "+ sum / 5);
		}
		static void Change6(int[] a)
		{
			int col=0;
			for (int i=0;i<a.length; i++)
				if (a[i]%2!=0)
				{
					col+=1;
				}
			System.out.println("nechetnih elementov=" + col);
		}
		static void Change7(int[] a)
		{
			System.out.print("x=");
			int x=in.nextInt();
			System.out.print("y=");
			int y=in.nextInt();
			int sum=0;
		for(int i = 0; i<a.length;i++)
			if (a[i] >= x && a[i]<= y)
			{
				sum+=a[i];
			}
			System.out.println("summa= "+sum);
		}
		static void Change8(int[] a)
		{
			int sum=0;
			for (int i=0;i<a.length; i++)
				if (a[i]%9==0)
				{
					sum+=a[i];
				}
			System.out.println("summa= "+sum);
		}
		static void Change9(int[] a)
		{
			int x=in.nextInt();
			for (int i=0;i<a.length; i++)
				if (a[i]>x)
				{
					System.out.print("Nomer elementa>x "+""+i+"\n");
				}
		}
		static void Change10(int[] a)
		{
			for (int i=0;i<a.length; i++)
				if(a[i]%2!=0)
				{
					System.out.println("Nomera vseh nechetnih elementov" +" "+ i);
				}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		System.out.println("vvedi razmer massiva:");
		int n=in.nextInt();
		int[] a=new int[n];
		Massiv(a);
		Print(a);
		System.out.println();
		System.out.print("zadanie (1-10): ");
		int z=in.nextInt();
		switch (z)
		{
		case 1:
		{
			Change1(a);
			System.out.println("new massiv");
			Print(a);
		}
		break;
		case 2:
		{
			Change2(a);
			System.out.println("new massiv");
			Print(a);
		}
		break;
		case 3:
		{
			Change3(a);
			System.out.println("new massiv");
			Print(a);
		}
		break;
		case 4:
		{
			Change4(a);
			Print(a);
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
			Print(a);
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
