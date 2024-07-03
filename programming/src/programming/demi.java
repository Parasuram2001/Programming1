package programming;

public class demi {
	static int reverseNumber(int no) {
		int reverse = 0;
		while (no != 0) {
			int rem = no % 10;
			reverse = reverse * 10 + rem;
			no = no / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		int no = 1234;
		int rem1 = 0;
		int quo = 0;
		rem1 = no % 100;
		quo = no / 100;
		quo=reverseNumber(quo);// 12
		//rem1=reverseNumber(rem1);//34
		System.out.print(quo + "" + rem1);
	}
}
