package FundamentalPrograms;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 3,3, 4,4 };
		boolean flag = true;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if (a[i] == a[j])
				{
					System.out.println("found duplicate : "+a[i]);
					flag = false;
					break;
				}
			}
		}

		if (flag == true) {
			System.out.println("no duplicate");
		}

	}

}
