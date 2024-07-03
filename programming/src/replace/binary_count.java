package replace;

public class binary_count {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=33;
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==0||rem==1)
			{
				count++;
			}
			no=no/10;
		}
		System.out.println(count);

	}

}
