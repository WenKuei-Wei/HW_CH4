
public class P09 {
	public static void main(String[] args) 
	{
		RacingCar3 	rccar1 = new RacingCar3(4,5.5,7);
		rccar1.newshow();

	}

}
class Car3
{
	protected int num;
	protected double gas;
	
	public Car3()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car3(int n,double g)
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

class RacingCar3 extends Car3
{
	private int course;
	
	public RacingCar3()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public RacingCar3(int n,double g,int c)
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
	public void newshow()
	{
		System.out.println("車號為"+num+"，油量為"+gas);
		System.out.println("編號為"+course);
	}
}