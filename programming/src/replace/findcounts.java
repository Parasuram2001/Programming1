package replace;

public class findcounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int arr[]= {10,30,10,20,10};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==10)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
