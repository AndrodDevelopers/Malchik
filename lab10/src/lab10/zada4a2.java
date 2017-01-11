package lab10;
import java.util.Scanner;
public class zada4a2 {
		static Scanner in;
		static void Massiv(int[] a)
		{
			for (int i=0; i<a.length; i++)
			{
				System.out.printf("a[%d]= ", i);
				a[i]=in.nextInt();
			}
		}
		static void Print(int[] a)
		{
			for (int i=0; i<a.length; i++)
				System.out.printf("%d ", a[i]);
				System.out.println();
		}
		static void Change1(int[] a)
		{
			int min= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (min >= a[i])
				{
					min=a[i];
				}
			}
			for (int j=0; j<a.length;j++)
			{
				if (min==a[j])
				{
					System.out.println("min element= "+min+" pod nomerom: "+j);
				}
			}
		}
		static void Change2(int[] a)
		{
			int max= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (max <= a[i])
				{
					max=a[i];
				}
			}
			for (int j=0; j<a.length;j++)
			{
				if (max==a[j])
				{
					a[j]=0;
				}
			}
		}
		static void Change3(int[] a)
		{
			int min= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (min >= a[i])
				{
					min=a[i];
				}
			}
			for (int j=0; j<a.length;j++)
			{
				if (min==a[j])
				{
					a[j]=-a[j];
				}
			}
		}
		static void Change4(int[] a)
		{
			int z=0;
			int max= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (max <= a[i])
				{
					max=a[i];
				}
			}
			for (int j=0; j<a.length;j++)
			{
				if (max==a[j])
				{
					z=a[j];
					a[j]=a[0];
					a[0]=z;
				}
			}
		}
		static void Change5(int[] a)
		{
			int max= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (max <= a[i])
				{
					max=a[i];
				}
			}
			for (int j=0; j<a.length;j++)
			{
				if (max!=a[j])
				{
					System.out.println("ne sovpadaet s max: " +j);;
				}
			}
		}
		static void Change6(int[] a)
		{
			int imin=0;
			int min= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (min > a[i])
				{
					min=a[i];
					imin=i;
				}
			}	
			System.out.println("perviy min element= "+min+" pod nomerom: "+imin);
		}
		static void Change7(int[] a)
		{
			int imax=0;
			int max= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (max <= a[i])
				{
					max=a[i];
					imax=i;
				}
			}
			System.out.println("posledniy max element= "+max+" pod nomerom: "+ imax);
		}
		static void Change8(int[] a)
		{
			System.out.println("Поменять местами первый min и последний max элементы");
			int imax=0;
			int imin=0;
			int min= a[0];
			int max= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (min > a[i]){
					min=a[i];
					imin=i;
					}
				if (max <= a[i]){
					max=a[i];
					imax=i;
					}
			}
			a[imin]=max;
			a[imax]=min;
		}
		static void Change9(int[] a)
		{
			int imax=0;
			int max= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (max < a[i])
				{
					max=a[i];
					imax=1;
				}
			}
			System.out.println("perviy max element= "+max+" pod nomerom: "+imax);
		}
		static void Change10(int[] a)
		{
			int imin=0;
			int min= a[0];
			for (int i=0; i<a.length; i++)
			{
				if (min >= a[i])
				{
					min=a[i];
					imin=i;
				}
			}
			System.out.println("posledniy max element= "+min+" pod nomerom: "+imin);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		System.out.println("vvedi razmer massiva:");
		int n=in.nextInt();
		int[] a=new int[n];
		Massiv(a);
		Print(a);
		System.out.println("(1-10)= ");
		int z=in.nextInt();
		switch (z)
		{
		case 1:
		{
			Change1(a);
		}
		break;
		case 2:
		{
			Change2(a);
			System.out.println("new massiv");
			Print(a);
		}
		break;
		case 3:
		{
			Change3(a);
			System.out.println("new massiv");
			Print(a);
		}
		break;
		case 4:
		{
			Change4(a);
			System.out.println("new massiv");
			Print(a);
		}
		break;
		case 5:
		{
			Change5(a);
			Print(a);
		}
		break;
		case 6:
		{
			Change6(a);
			Print(a);
		}
		break;
		case 7:
		{
			Change7(a);
			Print(a);
		}
		break;
		case 8:
		{
			Change8(a);
			Print(a);
		}
		break;
		case 9:
		{
			Change9(a);
			Print(a);
		}
		break;
		case 10:
		{
			Change10(a);
			Print(a);
		}
		break;
		}
	}

}
