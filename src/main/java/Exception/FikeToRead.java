package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FikeToRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("D:\\testfile.txt");
		try {
			Scanner myReader = new Scanner(f);
			while (myReader.hasNext()) {
				String data= myReader.next();
				System.out.println( data);
				
			}
			myReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
