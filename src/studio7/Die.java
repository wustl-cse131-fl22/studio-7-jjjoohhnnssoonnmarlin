package studio7;

public class Die {

	private int n;
	
	private Die (int nCopy) {
		n = nCopy;
	}
	
	private int returnNum (int n) {
		return (int) Math.round((Math.random() * (n-1))+1);
	}
	
	public static void main(String[] args) {
		Die d1 = new Die (6);
		System.out.println(d1.returnNum(6));

	}

}
