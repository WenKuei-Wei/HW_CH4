
public class P14 {
	public static void main(String[] args) 
	{
		Car5 car1;
		car1 = new RacingCar5();
		
		car1.setCar(1234, 20.5);
		car1.show();
	}

}
class Car5
{
	protected int num;
	protected double gas;
	
	public Car5()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car5(int n,double g)
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

class RacingCar5 extends Car5
{
	private int course;
	
	public RacingCar5()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar5(int n,double g,int c)
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