package lab11;
import java.util.Scanner;
public class zadacha3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Vvedite imya s malenkoi bukvi: ");
		StringBuilder f = new StringBuilder(in.nextLine());
		String fname = f.toString();
		System.out.print("Vvedite familiy s malenkoi bukvi: ");
		StringBuilder l = new StringBuilder(in.nextLine());
		String lname = l.toString();
		System.out.print("Vvedi otchestvo s malenkoi bukvi: ");
		StringBuilder m = new StringBuilder(in.nextLine());
		String mname = m.toString();
		char [] alfavit = new char[]{ ' ','à', 'á', 'â', 'ã', 'ä', 'å', '¸', 'æ', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î', 'ï', 'ð', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', '÷', 'ø', 'ù', 'ú', 'û', 'ü', 'ý', 'þ', 'ÿ' };
		char [] fname1 = fname.toCharArray();
		char [] lname1 = lname.toCharArray();
		char [] mname1 = mname.toCharArray();
		int sum=0;
		for (int i = 0; i < fname1.length; i++)
		{
			for (int j = 1; j < alfavit.length; j++){
				
				if (fname1[i] == alfavit[j])
				{
					sum +=j ;

				}
			}
		}
		for (int i = 0; i < lname1.length; i++)
		{
			for (int j = 1; j < alfavit.length; j++){
				
				if (lname1[i] == alfavit[j])
				{
					sum +=j ;

				}
			}
		}
		for (int i = 0; i < mname1.length; i++)
		{
			for (int j = 1; j < alfavit.length; j++){
				
				if (mname1[i] == alfavit[j])
				{
					sum +=j ;

				}
			}
		}
		int cod=0;
		System.out.println(sum);
		for (;sum != 0; sum/=10)
		{
			cod += (sum % 10); 
		}
		int code=0;
		code = cod/10 + (cod%10);
		System.out.println(code + " ");
	}
}
