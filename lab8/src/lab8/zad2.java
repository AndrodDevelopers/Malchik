package lab8;
import java.util.Scanner;
public class zad2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("n= ");
		int n=in.nextInt();
		// ez sposob (n*n)/2=kol-vo 4ernih esli (1.1) eto 4ernaya
		int black = 0;
		for (int i=1; i<=n; i++)
		{
			if (i%2 ==0)
			{
					for (int j=2; j<=n; j+=2)
					{
						black +=1;
					}
			}
			else
				{
					for (int j=1; j<=n; j+=2)
					{
						black +=1;
					}
				}
		}
			System.out.println("black = "+ black);
	}
}

