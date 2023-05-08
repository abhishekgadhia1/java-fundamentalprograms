package FundamentalPrograms;

public class PalindromStringWithoutReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "nayoiyan";
		boolean flag = true;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=name.charAt(name.length()-i-1)) {
				flag=false;
			break;
			}
		}
		
		if(flag==false)
			System.out.println("no palindrome");
		else
			System.out.println("yes palindrome");

	}

}
