
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
		System.out.println("�Ͳ��F���l");
	}
	public Car6(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F�����O"+num+"�A�o�q�O"+gas+"�����l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�����]��"+num+"�A�o�q�]��"+gas);
	}
	public void show()
	{
		System.out.println("������"+num+"�A�o�q��"+gas);
	}
}

class RacingCar6 extends Car6
{
	private int course;
	
	public RacingCar6()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar6(int n,double g,int c)
	{
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F�ɨ��A�s����"+course);
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]�w��"+course);
	}
	public void show()
	{
		System.out.println("������"+num+"�A�o�q��"+gas);
		System.out.println("�s����"+course);
	}
}