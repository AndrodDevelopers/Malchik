package lab11;
import java.util.Scanner;
public class zadacha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Vvedite stroky: ");
		StringBuilder a = new StringBuilder(in.nextLine());
		//1. Kol-vo bukv v stroke
		int sum=0;
		for (int i = 0; i<a.length(); i++){
			if (Character.isLetter(a.charAt(i))){
				sum++;
			}
		}
		System.out.println("Bukv v stroke: " + sum);
		//2. kol-vo cifr
				System.out.println("Vvedi stroky: ");
				StringBuilder str2=new StringBuilder(in.nextLine());
				sum = 0;
				for (int i = 0; i< str2.length(); i++)
				{
					if (Character.isDigit(a.charAt(i)))
					{
						sum++;
					}
				}
				System.out.println("kol-vo cifr= " + sum);
		//3. Menyaet mestami 1 i 2 bukvi, 3 i 4 i tak dalee
		char s=0;
		for (int i=0; i<a.length()-1; i+=2)
		{
			s=a.charAt(i);
			a.setCharAt(a.charAt(i), a.charAt(i+1));
			a.setCharAt(a.charAt(i+1), s);
		}
		System.out.println("new stroka: " + a);
		//4. ydalyaem srednyy bukvy esli dlina stroki nechetnaya i dve srednie esli chetnaya
		if (a.length()/2-1 == 0){
			a.delete(a.length()/2, a.length()/2+1);
		}
		else a.delete(a.length()/2-1, a.length()/2+1);
		System.out.println(a);
		//5. ydalyaem vse symvoli y
		char y='x';
		for (int i = 0; i < a.length();i++)
		{
			if (a.charAt(i)==y){
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
		
	}

}
