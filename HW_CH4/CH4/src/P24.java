
public class P24 {
	public static void main(String[] args) 
	{
		Car7 car1;
		car1 = new Car7();
		
		car1.setCar(1234,20.5);
		System.out.println(car1);
	}

}
class Car7
{
	protected int num;
	protected double gas;
	
	public Car7()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car7(int n,double g)
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
	
	public String toString()
	{
		String str = "車號"+num+"油量"+gas;
		return str;
	}
}

class RacingCar7 extends Car7
{
	private int course;
	
	public RacingCar7()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public RacingCar7(int n,double g,int c)
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
	public void show()
	{
		System.out.println("車號為"+num+"，油量為"+gas);
		System.out.println("編號為"+course);
	}
}