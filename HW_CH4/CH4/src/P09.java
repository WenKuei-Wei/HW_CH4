
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
		System.out.println("�Ͳ��F���l");
	}
	public Car3(int n,double g)
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

class RacingCar3 extends Car3
{
	private int course;
	
	public RacingCar3()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar3(int n,double g,int c)
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
	public void newshow()
	{
		System.out.println("������"+num+"�A�o�q��"+gas);
		System.out.println("�s����"+course);
	}
}