
public class P11 {
	public static void main(String[] args) 
	{
		RacingCar4 	rccar1 = new RacingCar4(4,5.5,7);
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
		
		rccar1.show();
		
	}

}
class Car4
{
	protected int num;
	protected double gas;
	
	public Car4()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car4(int n,double g)
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

class RacingCar4 extends Car4
{
	private int course;
	
	public RacingCar4()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar4(int n,double g,int c)
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