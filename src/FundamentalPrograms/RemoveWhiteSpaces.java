package FundamentalPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Abhishek Gadhia  M";
		
		String a = s.replaceAll("\\s", "");

		System.out.println(a);

	}

}
