package lab7;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("a= ");
		float a=in.nextFloat();
		System.out.print("b= ");
		float b=in.nextFloat();
		System.out.print("x= ");
		int x=in.nextInt();
		System.out.print("y= ");
		int y=in.nextInt();
		if (a>b) System.out.println("Vvedite a<=b");
		else
		{
		for (float i=a;i<=b; i++)
		{ 
			if(i%10 == x || i%10 == y)
			{
			System.out.println(" "+ i);
			}
		} 
		System.out.println("while");
		float j=a;
		while (j<=b)
		{
			if(j%10 == x || j%10 == y)
		
			{
			System.out.println(" "+ j);
			}
			j++;
	}
		System.out.println("do while");
		do
		{
			if(a%10 == x || a%10 == y)
			{
		System.out.println(" "+ a);
		
		}
			a++;
			}
		while (a<=b);
		}
	}

}
