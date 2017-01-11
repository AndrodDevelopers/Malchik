package lab10;

import java.util.Scanner;

public class primer1 {
	static Scanner in;
	static int[] Input()
	{
		System.out.print("Vvedi razmer massiva: ");
		int n=in.nextInt();
		int a[]=new int[n];
		for (int i=0; i<n; ++i)
		{
			System.out.printf("a[%d]= ",i);
			a[i]=in.nextInt();
		}
		return a;
	}
	static void Print(int[] a)
	{
		for (int i=0;i<a.length;++i)
			System.out.printf("%d ",a[i]);
			System.out.println();
	}
	static void Change(int[] a)
	{
		for (int i=0;i<a.length; ++i)
			if (a[i]>0) a[i]= -a[i];
	}
	public static void main(String[] args) {
		in=new Scanner(System.in);
		int[] myArray=Input();
		System.out.println("Ishodniy massiv: ");
		Print(myArray);
		Change(myArray);
		System.out.println("Izmenenniy massiv: ");
		Print(myArray);
		}
	}
