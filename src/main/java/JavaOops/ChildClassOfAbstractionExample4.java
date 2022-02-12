package JavaOops;

public class ChildClassOfAbstractionExample4 extends AbstrctionExample4 {

	void getName(String name) {
		System.out.println("Name : " + name);
	}

	void getGender(String gender) {
		System.out.println("Gender : " + gender);
	}

	void getCity(String city) {
		System.out.println("City : " + city);
	}

	public void getCountry(String country) {

		System.out.println(" Country :" + country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstrctionExample4 obj = new ChildClassOfAbstractionExample4();
		obj.getCity("Vizag");

		obj.getGender("Male");
		obj.getName("Suresh");

	}
}
