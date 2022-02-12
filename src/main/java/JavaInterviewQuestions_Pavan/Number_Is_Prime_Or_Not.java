package JavaInterviewQuestions_Pavan;

public class Number_Is_Prime_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number>1
		//Prime Number has only 2 factros those are 1 and itself

		int num =3;
		int count=0;
		
		if(num>1) 
		{
			for(int i=1;i<=num;i++) {

				if(num%i==0)
				
				count++;
			}
				if(count==2)
				{

					System.out.println("The number is PrimeNumber");
				}
				else 
				{
					System.out.println(" The number is Not Prime Number");
				}
			}
	
		else
		{

			System.out.println("The number is Not Prime Number");
		}

	}

}
