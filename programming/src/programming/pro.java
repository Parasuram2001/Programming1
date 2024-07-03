package programming;

public class pro {
	static int happy(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=7;
		int sum=0;
		while(no>9)
		{
			no=happy(no);
		}
		if(no==1||no==7)
		{
			System.out.println("happy number");
		}
		else {
			System.out.println("not a happy number");
		}

	}

}
