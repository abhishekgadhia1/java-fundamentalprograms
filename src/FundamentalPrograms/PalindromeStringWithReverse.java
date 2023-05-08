package FundamentalPrograms;

public class PalindromeStringWithReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "nayyan";
		String rev = "";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		
		if(name.equals(rev))
			System.out.println("yes palindrome");
		else
			System.out.println("no palindrome");

	}

}
