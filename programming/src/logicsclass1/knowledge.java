package logicsclass1;

public class knowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="knowledge";
		char[] ch=str.toCharArray();
		for (int i=0;i<=ch.length-1;i++)
		{
			if(i>3)
				System.out.print(ch[i]);
		}
		for(int i=ch.length-1;i>=0;i--)
		{
			if(i<=3)
			{
				System.out.print(ch[i]);
			}
		}
		

	}

}
