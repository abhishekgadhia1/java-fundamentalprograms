package FundamentalPrograms;

public class PalindromNumberWithoutReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 123321;
		boolean flag = false;
		
		String stringNum = Integer.toString(n);
		
		for(int i=0;i<stringNum.length();i++) {
			
			if(stringNum.charAt(i)!=stringNum.charAt(stringNum.length()-i-1))
			{	
			flag=true;
			break;
			}
				
		}
		if(flag==true)
			System.out.println("no palindrome");
		else
			System.out.println("yes palindrome");

	}

}
