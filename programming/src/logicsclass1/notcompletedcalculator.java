package logicsclass1;
import java.util.Scanner;
public class notcompletedcalculator {

	public static void main(String[] args) {
		Object system;
		// TODO Auto-generated method stubin 
		
		int no=1;
		while(no!=0)
		{
			Scanner sc=new Scanner(System.in);
			String s1="yes";
			String s2="no";
			String answer="yes/no";
			System.out.println("which operation do you want to perform:Addition Subtracttion Multiplication Division: ");
			
			String ans1=sc.next();
			String Addition="addition";
			String mul="multiplication";
			String sub="subtraction";
			String div="division";
			if(ans1==Addition)
			{
					System.out.println("enter the natural number a1: ");
					int a2=sc.nextInt();
					System.out.println("enter the natural number b1: ");
					int b2=sc.nextInt();
					int addition=a2+b2;
					System.out.println(" addition of two numbers is "+addition);
			}
			else if(ans1==mul) {
				System.out.println("enter the natural number a1: ");
				int a2=sc.nextInt();
				System.out.println("enter the natural number b1: ");
				int b2=sc.nextInt();
				int multiplication=a2*b2;
				System.out.println(" multiplication of two numbers is "+multiplication);
			}
			else if(ans1==sub) {
				System.out.println("enter the natural number a1: ");
				int a2=sc.nextInt();
				System.out.println("enter the natural number b1: ");
				int b2=sc.nextInt();
				int subtraction=a2-b2;
				System.out.println(" subtraction of two numbers is "+subtraction);
			}
			
			else if(ans1==div) {
				System.out.println("enter the natural number a1: ");
				int a2=sc.nextInt();
				System.out.println("enter the natural number b1: ");
				int b2=sc.nextInt();
				int division=a2/b2;
				System.out.println(" division of two numbers is "+division);
			}
			else {
				System.out.println("want to exit? exit");
			}
			
			
			
		}

	}
}


