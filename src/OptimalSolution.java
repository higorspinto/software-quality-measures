class LongNumber {

    /* adding a list of objects */
    public static Long sum(Long[] a) {
        Long sum = 0L;
        for(Long x : a) {
            sum += x;
        }
        return sum;
    }

    /* adding two objects */
    public static Long add(Long x, Long y) {
        return (x+y);
    }

    /* subtracting two objects */
    public static Long subtract(Long x, Long y) {
        return (x-y);
    }

    /* multiplying two objects */
    public static Long multiply(Long x, Long y) {
        return (x*y);
    }

    /* multiplying a list of objects */
    public static Long product(Long[] a) {
        Long pro = 1L;
        for(Long x : a) {
            pro *= x;
        }
        return pro;
    }

    /* dividing two objects */
    public static Long divide(Long x, Long y) {
        return (x/y);
    }
}

class DoubleNumber {

    /* adding a list of objects */
    public static Double sum(Double[] a) {
        Double sum = 0.0;
        for(Double x : a) {
            sum += x;
        }
        return sum;
    }

    /* adding two objects */
    public static Double add(Double x, Double y) {
        return (x+y);
    }

    /* subtracting two objects */
    public static Double subtract(Double x, Double y) {
        return (x-y);
    }

    /* Multiplying two objects */
    public static Double multiply(Double x, Double y) {
        return (x*y);
    }

    /* Multiplying a list of objects */
    public static Double product(Double[] a) {
        Double pro = 1.0;
        for(Double x : a) {
            pro *= x;
        }
        return pro;
    }

    /* Dividing two objects */
    public static Double divide(Double x, Double y) {
        return (x/y);
    }
}

class Complex {

    double real;
    double imag;

    /* Constructor of the class */
    public Complex(double re, double im) {
        this.real = re;
        this.imag = im;
    }

    /* Return a String of the format: "real + imag i" or "real - imag i" (note the spaces) */
    /* For example, when real = 2.0 and imag = -1.0, return "2.0 - 1.0 i" */
    public String toString() {
         String s1 = "";
         if(real>=0.0) {
             s1+=""+real+" ";
         }
         else {
             s1+="- "+(real*-1.0)+" ";
         }
         if(imag >= 0.0){
            s1+="+ "+imag+" i";
         }   
         else {
             s1+="- "+(imag*-1.0)+" i";
         }
         return s1;
    }

    /* Adding a list of objects */
    public static Complex sum(Complex[] array) {
        Complex tmp = new Complex(0,0);
        for(Complex x: array) {
            tmp = add(tmp , x);
        }
        return tmp;
    }

    /* Adding two objects */
    public static Complex add(Complex x, Complex y) {
        return new Complex(x.real + y.real, x.imag + y.imag);
    }

    /* Subtracting two objects */
    public static Complex subtract(Complex x, Complex y) {
        return new Complex(x.real - y.real, x.imag - y.imag);
    }

    /* Multiplying two objects */
    public static Complex multiply(Complex x, Complex y) {
        return new Complex(x.real * y.real - x.imag * y.imag , x.imag * y.real + x.real * y.imag );
    }

    /* Multiplying a list of objects */
    public static Complex product(Complex[] a) {
        Complex tmp = new Complex(1,0);
        for(Complex x: a) {
            tmp = multiply(tmp , x);
        }
        return tmp;
    }

    /* Conjugate function. Used in divide function. */
    private static Complex conjugate(Complex a) {
        return new Complex(a.real , -a.imag);
    }

    /* Dividing two objects */
    /* Use the conjugate method to perform division */
    public static Complex divide(Complex x, Complex y) {
        Complex c1 = (multiply(x,conjugate (y)));
        Complex c2 = (multiply(y, conjugate(y)));
        return new Complex(c1.real/c2.real,c1.imag/c2.real);
    }
}

class Vector {

    double[] components;

    /* Constructor of the class */	
    public Vector(int n) {
        this.components = new double[n]; 
    }

    /* Return a String of the format: "<v1, v2, v3, ...>" (note the space after comma) */
    /* For example, when the components are 1.0 and -2.0, return "<1.0, -2.0>" */    
    public String toString() {
        int n = this.components.length;
        
        String str = "<";
        for(int i= 0 ; i < n ; i++ ) {
            if( this.components[i] >= 0.0) {
                str += this.components[i];
            }
            else {
                str += "-"+(this.components[i]*-1);
            }
            if(i < n-1) 
            	str += ", ";
            else 
            	str+=">";
        }
        return str;
    }

    /* Adding a list of objects */
    public static Vector sum(Vector[] array) {
        int n = array.length;
        Vector v = array[0];
        for(int i=1; i<n; i++){
            v=add(v,array[i]);
        }
        return v;
    }

    /* Adding two objects */
    public static Vector add(Vector x, Vector y) {
        int n1 = x.components.length;
        int n2 = y.components.length;
        
        Vector res; 
        
        if(n1 >= n2){
        	res = new Vector(n1);
        	
        	for(int i =0 ; i < n2; i++ ) {
        		res.components[i] = x.components[i] +  y.components[i];
        	}
        	return res;
        }
        else
        {
        	res = new Vector(n2);
        	
        	for(int i =0 ; i < n1; i++ ) {
            	res.components[i] = y.components[i] +  x.components[i];    
            }
            return res;
        }
    }

    /* Subtractiong two objects */
    public static Vector subtract(Vector x, Vector y) {
        int n1 = x.components.length;
        int n2 = y.components.length;
        
        Vector res;
        
        if(n1 >= n2){
        	res = new Vector(n1);
        	
        	for(int i = 0 ; i < n2; i++ ) {
        		res.components[i] = x.components[i] - y.components[i];
        	}
        	return res;
        }
        else{
        	res = new Vector(n2);
        	
        	for(int i =0 ; i < n1; i++ ) {
            	res.components[i] = y.components[i] - x.components[i];
            }
            
            for(int i=0; i<n2; i++) {
            	res.components[i] *= -1.0;
            }
            
            return res;
        }
    }

    /* Function dot Product */
    public static double dotProduct(Vector x, Vector y) {
        double sum = 0.0;
        int n = x.components.length;
        
        for(int i =0 ; i < n; i++ ) {
            sum += x.components[i]*y.components[i];
        }
        return sum;
    }

    /* Function cross Product */
    public static Vector crossProduct(Vector x, Vector y) {
        
        int n = x.components.length;
        int n2 = y.components.length;
        if( n < n2 ) n = n2;
        if( n < 3) n = 3;
        
        Vector v1 = new Vector(n);
        Vector v2 = new Vector(n);
        Vector v3 = new Vector(n);
        
        for(int i =0 ; i < x.components.length ; i++ ) {
            v1.components[i] = x.components[i];
        }
        for(int i =0 ; i < y.components.length ; i++ ) {
            v2.components[i] = y.components[i];
        }
        
        for(int i =0 ; i < n ; i++ ) {
            v3.components[i] = v1.components[(i+1)%n] * v2.components[(i+2)%n] - v1.components[(i+2)%n] * v2.components[(i+1)%n];     
        }
        
        int cnt= 0;
        for(int  i = n-1 ; i >= 0 ; i--) {
            if( v3.components[i] !=0 ) 
            	break;
            else 
            	cnt++;
        }
        
        Vector ans = new Vector(n-cnt);
        n = n - cnt;
        for(int i =0 ; i < n ; i++ ) {
            ans.components[i] = v3.components[i];
        }
        
        return ans;
    }

    /* scalar Product Function */
    public static Vector scalarMultiplication(double x, Vector y) {
        int n = y.components.length;
        for(int i =0 ; i < n ; i++ ) {
            y.components[i] *= x;
        }
        return y;
    }
}

class Logic {
    
	/*
    We want fill a tank of goal litter of water.
    We have small jar (5 litter each) and big jar (20 litter each).
    Return the number of small jar to use, Assuming we always use big jar before small jar.
    Return -1 if it can't be done.

    fillTank(1, 1, 25) → 1
    fillTank(3, 2, 25) → 1
    fillTank(2, 2, 60) → -1
    fillTank(4, 4, 80) → 0
    */
	
    /* fillTank Function (numberOfSmallJar, numberOfBigJar, tankCapacity) */
    public static int fillTank(int smallJar, int bigJar, int goalTank) {
       
        int temp = goalTank/20;
        if(temp > bigJar)
        	temp = bigJar;
        
        int rem = goalTank - (20*temp);
        if(rem > smallJar*5)
        	return -1;
        
        if(rem%5 != 0)
        	return -1;
        else
        	return rem/5;
    }
}
