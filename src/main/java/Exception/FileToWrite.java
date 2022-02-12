package Exception;

import java.io.FileWriter;
import java.io.IOException;

public class FileToWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer=new FileWriter("D:\\testfile.txt");
			writer.write("File Writer");
			writer.close();
			System.out.println(" my writing closed");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
			System.out.println("IOException...");
		}

	}

}
