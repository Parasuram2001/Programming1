package logicsclass1;

public class perfectnoornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=6;
		int sum=0;
		for (int i=1;i<=no/2;i++)
		{
			if (no%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		if(sum==no)
		{
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}

	}

}
