public class p38 {

	public static void main(String[] args) {
		ivehical[] ivc;
		ivc = new ivehical[2];
		
		ivc[0] = new car38(1234,20.5);
		ivc[1] = new plane38(123);
		
		for(int i = 0; i<ivc.length ; i++) {
			ivc[i].show();
		}

	}

}

interface ivehical{
	int weight = 1000;
	void show();
}

class car38 implements ivehical{
	  private int num;
	  private double gas;
	  public car38(int n, double g){
	    num = n;
	    gas = g;
	    System.out.println("Create the Car NO." + n + " The car gas : " + gas);
	  }
	  public void show(){
	    System.out.println("Car number: " + num);
	    System.out.println("Car gas: " + gas);
	    
	  }
	}

class plane38 implements ivehical{
	  private int flight;
	  public plane38(int f){
	    flight = f;
	    System.out.println("Create the flight" + flight + "of Plane");
	  }
	  public void show(){
	    System.out.println("Plane's flight: "+ flight);
	    
	  }
	}