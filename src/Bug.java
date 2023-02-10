
public class Bug {
	
	public int position;
	public String direction;
	
		public Bug(int initialPosition) {
			position = initialPosition;
			direction = "right";
		}
		
		
		public void turn() {
			if(direction.equals("right")) {
				direction = "left";
			} else {
				direction = "right";
			}
		}
		
		public void move() {
			if (direction.equals("right")) {
				position ++;
			} else {
				position --;
			}
		}
		
		public String getDirection() {
			return direction;
		}
		
		public int getPosition() {
			return position;
		}
 
}

