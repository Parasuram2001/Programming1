package logicsclass1;

public class substring {
	public void print(String str,int no)
	{
		for (int i=1;i<=no;i++)
		{
		System.out.print(str.substring(str.length()-no));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substring s1=new substring();
		String str="hello";
		int no=3;//4,2,3,1
		s1.print(str,no);

	}

}
