
public class p32 {

	public static void main(String[] args) {
		vehical[] vc;
		vc = new vehical[2];
		
		vc[0] = new car2(1234,20.5);
		vc[1] = new Plane(123);
		
		for(int i=0; i<vc.length; i++) {
			if(vc[i] instanceof car2) {
				System.out.println("NO." + (i+1) + " are Car's class");
			}else {
				System.out.println("NO." + (i+1) + " aren't Car's class");
			}
		}

	}

}
