package logicsclass1;

public class arr4 {
	void reverseString(String str1)
	{
		char[] ch=str1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr4 y=new arr4();
		String[] str= {"dharmaraya","arjuna","bheema","nakula","sahadeva"};
		for(int i=0;i<str.length;i++)
		{
			y.reverseString(str[i]);
		}
	}

}
