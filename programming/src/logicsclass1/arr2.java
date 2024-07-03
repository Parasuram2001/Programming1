package logicsclass1;

public class arr2 {
	static void factorial(int no,int fact)
	{
		for (int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial "+fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int fact=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			factorial(arr[i],fact);
			}
			else {
				System.out.println(arr[i]);
			}
		}

	}

}
