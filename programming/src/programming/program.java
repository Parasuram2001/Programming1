package programming;

public class program {
	static void reverseString(String str,String reverse)
	{
		
		str=str.replaceAll(" ", "");
		for (int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse=" ";
		String str2="mal aya lam";
		reverseString(str2,reverse);
	}

}
