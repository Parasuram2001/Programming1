package programming;

public class dani {
	static void reverseNumber(int input1)
	{
		int reverse=0;
		int copy=input1;
		while(input1!=0)
		{
			int rem=input1%10;
			reverse=reverse*10+rem;
			input1=input1/10;
			
		}
		if(copy==reverse)
		{
			System.out.println(reverse);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {38432,26462,78431,64246,37873};
		for(int i=0;i<arr.length;i++)
		{
			reverseNumber(arr[i]);
		}
		

	}

}
