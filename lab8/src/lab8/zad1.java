package lab8;

public class zad1 {

	public static void main(String[] args) {
		System.out.println("2 variant");
		for (int i=1; i<=4; i++, System.out.println())
		{
			for (int j=1;j<=10;j++)
				System.out.print(" " +j);
		}
		System.out.println("3 variant");
		for (int i=1; i<=5; i++, System.out.println())
		{
			for (int j=-10;j<=12;j++)
				System.out.print(" " +j);
		}
		System.out.println("4 variant");
		for (int i=40; i<=70; i+=10,System.out.println())
		{
			for (int j=i+1;j<=i+10; j++)
				System.out.print(" " + j);
		}
		System.out.println("5 variant");
		for (int i=1; i<=5; i++,System.out.println())
		{
			for (int j=1;j<=i; j++)
				System.out.print(" " + 5);
		}
		System.out.println("6 variant");
		for (int i=1; i<=5; i++,System.out.println())
		{
			for (int j=5;j>=i; j--)
				System.out.print(" " + 1);
		}
		System.out.println("7 variant");
		for (int i=1; i<=5; i++,System.out.println())
		{
			for (int j=1;j<=i; j++)
				System.out.print(" " + i);
		}
		System.out.println("11 variant");
		for (int i=1; i<=5; i++,System.out.println())
		{
			for (int j=1;j<=i; j++)
				System.out.print(" " + j);
		}
	}

}
