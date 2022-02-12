package ArrayExamples;

public class MinNumberInTwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a ={{6,8,2,1},{10,3,9,5}};
		
		int min = a[0][0]; 
		
		for(int row=0;row<a.length;row++)
		{
			//System.out.println("Row value :" +row);
			for (int col=0;col<a[0].length;col++)
			{
				//System.out.println("Coloumn value : +"+col);
				//System.out.println(" Mimin No :" + min);
				
				if(a[row][col]<min)
				{
					min =a[row][col];
					
				}
				
			}
			 
			
		}
		
		System.out.println(" Print Min No in  Two array :"+min);
	}

}
