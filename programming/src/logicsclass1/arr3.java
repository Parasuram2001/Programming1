package logicsclass1;

public class arr3 {
	static void reverseString(String str1)
	{
		String reverse=" ";
		for(int i=str1.length()-1;i>=0;i--)
		{
			reverse=reverse+str1.charAt(i);
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"dharmaraya","arjuna","bheema","nakula","sahadeva"};
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=="bheema")
			{
			reverseString(str[i]);
			}
			else {
				System.out.println(str[i]);
			}
		}

	}

}
