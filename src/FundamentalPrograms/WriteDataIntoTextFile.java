package FundamentalPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDataIntoTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter(vsvwvw);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hey what is up");
		
		System.out.println("done");
		
		bw.close();
	}

}
