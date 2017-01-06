package lab7;

public class zad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=100; i<=999; i++)
		{
			if (i%10 == i/100)
			{
				System.out.print(" "+ i);
			}
		}
		System.out.println("\nWhile");
		int x=100;
		while (x<=999)
		{
			if (x%10 == x/100)
			{
				System.out.print(" " + x);
			}
			x++;
		}
		System.out.println("\ndo While");
		int y=100;
		do
		{
			if (y%10 == y/100)
			{
				System.out.print(" " + y);
			}
			y++;
		}
		while (y<=999);
	}

}
