package studio7;

public class Fraction {

	private int numerator;
	private int denominator; 
	
	private Fraction(int numeratorCopy, int denominatorCopy) {
		numerator = numeratorCopy;
		denominator = denominatorCopy;
	}
	
	private double actualFraction (int numerator, int denominator) {
		double actualFraction = numerator / denominator;
		return actualFraction;
	}
	
	private double addition (int numerator1, int denominator1, int numerator2, int denominator2) {
		double addition = actualFraction(numerator1, denominator1) + actualFraction(numerator2, denominator2);
		return addition;
	}
	
	private double multiply (int numerator1, int denominator1, int numerator2, int denominator2) {
		double multiply = actualFraction(numerator1, denominator1) * actualFraction(numerator2, denominator2);
		return multiply;
	}
	
	private double reciprical (int numerator, int denominator) {
		double reciprocal = actualFraction(denominator, numerator);
		return reciprocal;
	}
	
	private String simplify (int numerator, int denominator) {
		int gcf = 1;
		for (int a = 1; a <= numerator; a++) {
			if (numerator%a == 0 && denominator%a == 0) {
				gcf = a;
			}
		}
		int simplifyNum = numerator / gcf;
		int simplifyDen = denominator / gcf;
		String simplify = simplifyNum + "/" + simplifyDen;
		return simplify;
	}
	
	public static void main(String[] args) {
		Fraction frac = new Fraction (4, 8);
		System.out.println(frac.simplify(4, 8));

	}

}
