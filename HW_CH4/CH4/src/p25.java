
public class p25 {

	public static void main(String[] args) {
		ccar car1 = new ccar();
		ccar car2 = new ccar();
		ccar car3;
		car3 = car1;
		
		System.out.println("Car1 == Car2"+car1.equals(car2));
		System.out.println("Car1 == Car3"+car1.equals(car3));

	}

}

class ccar{
	protected int num;
	protected double gas;
	
	public ccar() {
		num = 0;
		gas = 0.0;
		System.out.println("Create the Car");
	}
}
