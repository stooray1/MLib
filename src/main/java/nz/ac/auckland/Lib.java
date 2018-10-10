package nz.ac.auckland;

public class Lib {
	
	/**
	 * Returns the greater of three int values.
	 * If the arguments have the same value, the result is that same value.
	 * 
	 * @param a first argument 
	 * @param b second argument
	 * @param b third argument  
	 * @return the larger of a, b and c
	 */
	public static int max(int a, int b, int c) {
		int m=a;
		if(m<b)
			m=b;
		if(m<c)
			m=c;
		return m;
	}
	
	/**
	 * Returns the smaller of three int values.
	 * If the arguments have the same value, the result is that same value.
	 * 
	 * @param a first argument 
	 * @param b second argument
	 * @param b third argument  
	 * @return the smaller of a, b and c
	 */
	public static int min(int a, int b, int c) {
		int m=a;
		if(m>b)
			m=b;
		if(m>c)
			m=c;
		return m;
	}
	
	/**
	 * Returns the factorial of number.
	 * Test code 
	 * 
	 * @param n integer number 
	 * @return the factorial of number 
	 */
	public static int fact(int n) {
		if(n<=1)return n;
		else return n* fact(n-1);		
	}
	
	/**
	 * Returns the abs number.
	 * Test code 
	 * 
	 * @param n integer number 
	 * @return the absolute number 
	 */
	public static int abs(int n) {
		if(n<0)return n*-1;
		return n;		
	}

}
