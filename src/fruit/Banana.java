package fruit;

public class Banana {
	int price;
	int grade;
	
	boolean clean;
	
	public void ate() {
		price -= 800;
	}
	
	public void clean() {
		clean = true;
	}
}
