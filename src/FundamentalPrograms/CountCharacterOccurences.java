package FundamentalPrograms;

public class CountCharacterOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java programming";
		
		int totalCount = s.length();
		
		int totalCountAfterRemoval = s.replace("a", "").length();
		
		int count = totalCount - totalCountAfterRemoval;
		
		System.out.println(count);
		
		

	}

}
