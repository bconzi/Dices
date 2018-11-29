package dices;

public class Dices {

	
	
	private int face1, face2, face3;
	
	//I declare the dices in a final method because the range wont ever change
	
	final public void play () {
		
		face1= (int) (Math.random() * 6) + 1;
		face2= (int) (Math.random() * 6) + 1;
		face3= (int) (Math.random() * 6) + 1;
	}
	
	
	//Show the numbers the person gets 
	
	public String toString() {
		return "These are your numbers: " + face1 + ", " + face2 + ", " + face3 ;
	}

	
	//Calculate and show a result
	
	public String result() {
		
		if(face1 == face2 && face2==face3) {
			return "You win!!!";	
		}
		else {
			
			return "You missed, keep trying!!!";
		}
		
	}
	
	
}
