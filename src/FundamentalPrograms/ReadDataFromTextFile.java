package FundamentalPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDataFromTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader(sklnvks);
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();

	}

}
