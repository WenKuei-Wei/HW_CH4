
public class p26 {

	public static void main(String[] args) {
		cccar[] cars;
		cars = new cccar[2];
		cars[0] = new cccar();
		cars[1] = new rRacingCar();
		
		for(int i = 0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("NO." + (i+1) + " Object's class is " + cl);
		}

	}

}
class rRacingCar extends cccar{
	public rRacingCar() {
		System.out.println("Create the RacingCar");
	}
}

class cccar
{
	protected int num;
	protected double gas;
	
	public cccar()
	{
		num = 0;
		gas = 0.0;
		System.out.println("Create the Car");
	}
}