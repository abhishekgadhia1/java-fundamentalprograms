package FundamentalPrograms;

public class PalindromeNumberWithReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12344321;
		int rev = 0;
		int orig_n = n;
		
		while(n!=0)
		{
			rev = rev * 10 + n%10;
			n = n/10;
		}
		
		if(rev==orig_n)
			System.out.println("yes palindrome");
		else
			System.out.println("no palindrome");

	}

}
