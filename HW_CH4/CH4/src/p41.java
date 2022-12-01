
public class p41 {

	public static void main(String[] args) {
		car41 car1 = new car41(1234,20.5);
		car1.vshow();
		car1.mshow();

	}

}
interface ivehical41{
	void vshow();
}
interface imaterial{
	void mshow();
}
class car41 implements ivehical41,imaterial{
	private int num;
	private double gas;
	
	public car41(int n, double g) {
		num = n;
		gas = g;
	    System.out.println("Create the Car NO." + n + " The car gas : " + gas);
	  }
	  public void vshow(){
	    System.out.println("Car number: " + num);
	    System.out.println("Car gas: " + gas);	  
	}
	  public void mshow(){
		    System.out.println("the material of car is iron");
		    	  
		}
}