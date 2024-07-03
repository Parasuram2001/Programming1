package classlogic;

public class strongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=101;i<=70000;i++)
		{
		int no=i;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+factorial(rem);
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println(sum+" is a strong number");
		}
	}
	}
	static int factorial(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}


