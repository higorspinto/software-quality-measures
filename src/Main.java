
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// Testing LongNumber Class
		System.out.println("Testing LongNumber Class: ");
		
		Long[] longArray;
		longArray = new Long[3];
		
		longArray[0] = 1L;
		longArray[1] = 2L;
		longArray[2] = 3L;
		
		Long sumL = LongNumber.sum(longArray);
		System.out.println("sum = " + sumL);
		
		Long aL = 3L;
		Long bL = 2L;
		
		Long addL = LongNumber.add(aL, bL);
		System.out.println("add = " + addL);
		
		Long subL = LongNumber.subtract(aL, bL);
		System.out.println("sub = " + subL);
		
		Long multL = LongNumber.multiply(aL, bL);
		System.out.println("mult = " + multL);
		
		Long prodL = LongNumber.product(longArray);
		System.out.println("prod = " + prodL);
		
		Long divL = LongNumber.divide(aL, bL);
		System.out.println("div = " + divL);
		
		
		/// Testing DoubleNumber Class
		System.out.println("\n");
		System.out.println("Testing DoubleNumber Class");
		
		Double[] doubleArray;
		doubleArray = new Double[3];
		
		doubleArray[0] = 1.0;
		doubleArray[1] = 2.0;
		doubleArray[2] = 3.0;
		
		Double sumD = DoubleNumber.sum(doubleArray);
		System.out.println("sum = " + sumD);
		
		Double aD = 3.0;
		Double bD = 2.0;
	
		Double addD = DoubleNumber.add(aD, bD);
		System.out.println("add = " + addD);
		
		Double subD = DoubleNumber.subtract(aD, bD);
		System.out.println("sub = " + subD);
		
		Double multiD = DoubleNumber.multiply(aD, bD);
		System.out.println("multi = " + multiD);
		
		Double prodD = DoubleNumber.product(doubleArray);
		System.out.println("prod = " + prodD);
		
		Double divD = DoubleNumber.divide(aD, bD);
		System.out.println("div = " + divD);
		
		
		/// Testing Complex Class
		System.out.println("\n");
		System.out.println("Testing Complex Class");
		
		Complex complexA = new Complex(2.0, -1.0);
		System.out.println("Complex A = " + complexA.toString());
		
		Complex complexB = new Complex(1.0, -1.0);
		System.out.println("Complex B = " + complexB.toString());
		
		Complex[] complexArray;
		complexArray = new Complex[3];
		
		complexArray[0] = new Complex(2.0, -1.0);
		complexArray[1] = new Complex(3.0, -2.0);
		complexArray[2] = new Complex(1.0, -1.0);
		
		Complex sumC = Complex.sum(complexArray);
		System.out.println("sum = " + sumC);
		
		Complex addC = Complex.add(complexA, complexB);
		System.out.println("add = " + addC);
		
		Complex subC = Complex.subtract(complexA, complexB);
		System.out.println("sub = " + subC);
		
		Complex multiC = Complex.multiply(complexA, complexB);
		System.out.println("multi = " + multiC);
		
		Complex prodC = Complex.product(complexArray);
		System.out.println("prod = " + prodC);
		
		Complex divC = Complex.divide(complexA, complexB);
		System.out.println("div = " + divC);
		
		/// Testing Complex Class
		System.out.println("\n");
		System.out.println("Testing Vector Class");
		
		Vector vectorA = new Vector(3);
		vectorA.components[0] = 1.0;
		vectorA.components[1] = 2.0;
		vectorA.components[2] = 3.0;
		System.out.println("Vector A = " + vectorA.toString());
		
		Vector vectorB = new Vector(3);
		vectorB.components[0] = 3.0;
		vectorB.components[1] = 2.0;
		vectorB.components[2] = 1.0;
		System.out.println("Vector B = " + vectorB.toString());
		
		Vector[] arrayVector;
		arrayVector = new Vector[2];
		arrayVector[0] = vectorA;
		arrayVector[1] = vectorB;
		
		Vector sumV = Vector.sum(arrayVector);
		System.out.println("sum = " + sumV);
		
		Vector addV = Vector.add(vectorA, vectorB);
		System.out.println("add = " + addV);
		
		Vector subV = Vector.subtract(vectorA, vectorB);
		System.out.println("sub = " + subV);
		
		double dotV = Vector.dotProduct(vectorA, vectorB);
		System.out.println("dot Product = " + dotV);
		
		Vector crossV = Vector.crossProduct(vectorA, vectorB);
		System.out.println("cross Product = " + crossV);
		
		Vector scalar = Vector.scalarMultiplication(2.0, vectorA);
		System.out.println("scalar Product = " + scalar);
		
		/// Testing Logic Class
		System.out.println("\n");
		System.out.println("Testing Logic Class");
		int smallJar = Logic.fillTank(2, 4, 80);
		System.out.println("number of small jar = " + smallJar);
		
	}

}
