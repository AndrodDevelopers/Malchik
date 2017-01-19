package lab11;
import java.util.Scanner;
public class zadacha1 {
	public static void main(String[] args) {
		//1. Vivesti tolko te slova soobsheniya, kotorie soderjat ne bolee chem n bykv
		Scanner in=new Scanner(System.in);
		System.out.print("Vvedite tekst: ");
		StringBuilder s=new StringBuilder(in.nextLine());
		String a = s.toString();
		System.out.println("Vvedi n: ");
		int n = in.nextInt();
		String [] b= a.split("\\p{P}?[ \\t\\n\\r]+");
		for (int i=0; i<b.length;i++){
			if (b[i].length()<=n && b[i].length() !=0){
				System.out.print(" " + b[i]);
			}
		}
		System.out.println();
		System.out.println("naiti samoe dlinnoe soobshenie");
		String max=b[0];
		for (int i = 0; i < b.length; i++){
			if (max.length() < b[i].length()){
				max=b[i];
			}
		}
		System.out.println("samoe dlinnoe slovo: " + max);
		System.out.println();
		System.out.println("naiti samoe korotkoe soobshenie");
		String min=b[0];
		for (int i = 0; i < b.length; i++){
			if (min.length() > b[i].length()){
				min=b[i];
				System.out.print(" " + min);
			}
		}
		System.out.println();
		System.out.println("naiti vse samie dlinnie slova ");
		String max1=b[0];
		for (int i = 1; i < b.length; i++){
				if (max1.length() < b[i].length()){
					max1=b[i];
					}
			}
		for (int i = 0; i < b.length; i++){
			if (b[i].length() == max1.length()){
				System.out.println(" " + b[i]);
			}
		}
		System.out.println();
		System.out.println("naiti vse samie korotkie soobsheniya");
		String min1=b[0];
		for (int i = 0; i < b.length; i++){
			if (min1.length() > b[i].length()){
				min1=b[i];
			}
		}
		for (int i = 0; i < b.length; i++){
			if (b[i].length() == min1.length()){
				System.out.println(" " + b[i]);
			}
		}
	}
}
