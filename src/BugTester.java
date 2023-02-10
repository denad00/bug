
public class BugTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Bug bugsy = new Bug(5);
		
		bugsy.move();
		
		System.out.println("Bugsy is now facing " + bugsy.getDirection() + " and is in position " + bugsy.getPosition());
		
		
		bugsy.turn();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		
	
		System.out.println("Bugsy is now facing " + bugsy.getDirection() + " and is in position " + bugsy.getPosition());
		
		bugsy.turn();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move();
		
		System.out.println("Bugsy is now facing " + bugsy.getDirection() + " and is in position " + bugsy.getPosition());
	}

}
