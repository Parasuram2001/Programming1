package replace;
import java.util.Scanner;
public class arraycreatedynamic {
	static void dynamicInput(int no)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[no];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+" index value ");
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size: ");
		int size=sc.nextInt();
		dynamicInput(size);
		
		

	}

}
