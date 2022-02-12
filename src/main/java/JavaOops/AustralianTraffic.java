package JavaOops;

public class AustralianTraffic  implements CentralTraaffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraaffic obj = new AustralianTraffic();
		obj.redStop();
		obj.yellowWait();
		obj.greenGo();
		System.out.println(obj.x);
		
		AustralianTraffic At = new AustralianTraffic();
		At.walkOnSymbol();
		
		ContinentalTraffic CT = new AustralianTraffic();
		CT.trainSymbol();

	}

	public void greenGo() {
		// TODO Auto-generated method stub
		
		System.out.println(" Iam in greenGo Method");
	}

	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Iam in redStop Method");
	}

	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Iam in yellowWait Method");
	}
	
		
		public void walkOnSymbol() {
			
			System.out.println(" waliking");
		}

		public void trainSymbol() {
			// TODO Auto-generated method stub
			System.out.println(" Train Sysmbol of Continentaltraffic");
		}
		
	}



