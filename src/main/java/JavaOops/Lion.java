package JavaOops;

public class Lion  extends MethodOverridingExampleAnimal
{
	void  eat()
	{
		System.out.println("eating ...");
		System.out.println(" eaating meat..");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion  obj = new Lion();
		obj.eat();
		
	}

}
