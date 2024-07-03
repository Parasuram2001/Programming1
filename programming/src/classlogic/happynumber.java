package classlogic;

public class happynumber {

	public static void main(String[] args) {
		int count=0;
		for (int i=1;i<=100;i++)
		{
			int no=i;
			while(no>9)
			{
				no=numsum(no);
			}
		if(no==1||no==7)
		{
			count++;
		}
		System.out.println("count is "+count);
		}
		
		}
	static int numsum(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem;
			no=no/10;
		}
		return sum;
	}
	
}
