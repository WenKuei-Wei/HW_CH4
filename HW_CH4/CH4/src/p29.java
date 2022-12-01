class p29 {
  public static void main(String[] args) {
    vehical[] vc  = new vehical[2];
    vc[0] = new ccar2(1234,20.5);
    vc[0].setSpeed(60);
    vc[1] = new Plane(123);
    vc[1].setSpeed(500);

    for(int i = 0; i<vc.length ; i++){
      vc[i].show();
    }
  }
}
abstract class vehical{
  protected int speed;
  public void setSpeed(int s){
    speed = s;
    System.out.println("Set the speed :" + speed);
  }
  abstract void show();
}
class ccar2 extends vehical{
  private int num;
  private double gas;
  public ccar2(int n, double g){
    num = n;
    gas = g;
    System.out.println("Create the Car NO." + n + " The car gas : " + gas);
  }
  public void show(){
    System.out.println("Car number: " + num);
    System.out.println("Car gas: " + gas);
    System.out.println("Car speed: " + speed);
  }
}

class Plane extends vehical{
  private int flight;
  public Plane(int f){
    flight = f;
    System.out.println("Create the flight" + flight + "of Plane");
  }
  public void show(){
    System.out.println("Plane's flight: "+ flight);
    System.out.println("Speed: " + speed);
  }
}