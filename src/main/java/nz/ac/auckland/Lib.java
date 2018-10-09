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

}
