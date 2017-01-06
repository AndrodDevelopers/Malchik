package lab7;

public class zad2 {

	public static void main(String[] args) {
		{
			System.out.println("for");
			int i;
			double j,g;
		for(i=25, j=25.5, g=24.8; i<=35; i++,j++,g++, System.out.println())
			System.out.printf("%d %.1f %.1f", i,j,g);
		}
		int i=25;
		double j=25.5,g=24.8;
		System.out.println("while");
		while(i<=35){
			System.out.printf("%d %.1f %.1f", i,j,g);
			System.out.println();
		i++;j++;g++;
		}
			System.out.println("do while");
			i=25;
			j=25.5;g=24.8;
			do
			{
				System.out.printf("%d %.1f %.1f", i,j,g);
				System.out.println();
				i++;j++;g++;
			}
			while(i<=35);
			}
		}


