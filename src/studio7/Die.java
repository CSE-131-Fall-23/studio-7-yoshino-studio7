package studio7;

public class Die {
	private int n;

	
	public Die(int n) {
		this.n = n;

	}
	
	public void randomInt() {
		int random = (int)(Math.random()*n) + 1;
	}

	public static void main(String[] args) {
		Die d1 = new Die(6);
		d1.randomInt();
	}
}
