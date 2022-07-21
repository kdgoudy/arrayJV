
public class Main {

	public static void main(String[] args) {
	// array = used to store multiple values in a single variable
		
		String[] cars = new String[3];
		
		cars[0] = "WRX";
		cars[1] = "Lancer EVO";
		cars[2] = "GTI";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
