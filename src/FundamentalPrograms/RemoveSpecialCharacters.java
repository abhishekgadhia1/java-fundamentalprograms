package FundamentalPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "35809283$^%*&5673";
		
		String a = s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(a);

	}

}
