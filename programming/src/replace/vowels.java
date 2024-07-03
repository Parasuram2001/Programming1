package replace;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello java";
		String s2="hello python";
		int vowelCount=0;
		int vowelCount1=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
		
		for(int i=0;i<s2.length();i++)
		{
			char ch1=s2.charAt(i);
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
			{
				vowelCount1++;
			}
		}
		System.out.println(vowelCount1);

	}

}
