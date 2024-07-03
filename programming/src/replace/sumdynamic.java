package replace;
import java.util.Scanner;
public class sumdynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1: ");
		int no1=sc.nextInt();
		System.out.println("enter the number2: ");
		int no2=sc.nextInt();
		int sum1=0;
		int sum2=0;
		while(no1!=0)
		{
			int rem=no1%10;
			sum1=sum1+rem;
			no1=no1/10;
			
		}
		System.out.println("the sum of the number1 is "+sum1);
		
		while(no2!=0)
		{
			int rem=no2%10;
			sum2=sum2+rem;
			no2=no2/10;
			
		}
		System.out.println("the sum of the number2 is "+sum2);

	}

}
