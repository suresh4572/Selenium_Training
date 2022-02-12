package JavaOops;

public class MethodOverloading {
	
	static int add(int a , int b)
	{
	 return a+b;	
		
	}
	static int add( int a , int b, int c)
	{
		
		return a*b*c;
	}

	

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(MethodOverloading .add(2, 4));
			System.out.println(MethodOverloading .add(4, 6, 9));
	

}
}
