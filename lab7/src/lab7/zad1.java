package lab7;
public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for");
		for (int i = 60; i>=10; i-=2)
				System.out.println(" " + i);
		{
			System.out.println("while");
			int i=60;
		while (i>=10){
			System.out.println(" " + i);
			i-=2;
			}
		System.out.println("do while");
		i=60;
		do
		{
			System.out.println(" " +i);
			i-=2;
		}
		while (i>=10);
		}		
	}

}
