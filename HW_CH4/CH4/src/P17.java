
public class P17 {
	public static void main(String[] args) 
	{
		Car6 car1[];
		car1 = new Car6[2];
		
		car1[0] = new Car6();
		car1[0].setCar(1234,20.5);
		
		
		car1[1] = new RacingCar6();
		car1[1].setCar(4567, 30.5);
		for(int i=0;i<car1.length;i++)
		{
			car1[i].show();
		}
	}

}
class Car6
{
	protected int num;
	protected double gas;
	
	public Car6()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car6(int n,double g)
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

class RacingCar6 extends Car6
{
	private int course;
	
	public RacingCar6()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public RacingCar6(int n,double g,int c)
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