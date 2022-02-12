package Exception;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File obj = new File("D:\\testfile.txt");
		
		try {
			
			if(obj.exists())
			{
			System.out.println("File exists:"+obj.getName());
		}
			else{
				obj.createNewFile();
				System.out.println("File already created :");	
				}
		} 
		
		catch (IOException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
