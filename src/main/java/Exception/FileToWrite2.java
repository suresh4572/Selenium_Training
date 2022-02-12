package Exception;

import java.io.FileWriter;
import java.io.IOException;

public class FileToWrite2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter writer = new FileWriter("D:\\testfile.txt");
			
			writer.write(" Iam a Progammer");
			System.out.println(" wrintng text closed");
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException throws....");
			e.printStackTrace();
		}

	}

}
