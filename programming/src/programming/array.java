package programming;

public class array {
	static int reverseNumber(int input1)
	{
		int reverse=0;
		while(input1!=0)
		{
			int rem=input1%10;
			reverse=reverse*10+rem;
			input1=input1/10;
			
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {348,264,784,642,378};
		for (int i=0;i<arr.length;i++)
		{
			int x=reverseNumber(arr[i]);
			System.out.print(x+" ");
			
		}
		

	}

}
