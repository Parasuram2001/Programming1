package replace;

public class largestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,22, 33,44, 88};
		int largest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);

	}

}
