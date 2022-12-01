
public class P06 {
	public static void main(String[] args) 
	{
		RacingCar2 	rccar1 = new RacingCar2(1234,20.5,5);

	}

}
class Car2
{
	private int num;
	private double gas;
	
	public Car2()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car2(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號是"+num+"，油量是"+gas+"的車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("車號設為"+num+"，油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號為"+num+"，油量為"+gas);
	}
}

class RacingCar2 extends Car2
{
	private int course;
	
	public RacingCar2()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public RacingCar2(int n,double g,int c)
	{
		super(n,g);
		course = c;
		System.out.println("生產了賽車，編號為"+course);
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設定為"+course);
	}
}