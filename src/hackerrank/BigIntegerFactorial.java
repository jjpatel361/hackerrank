/**
 * 
 */
package hackerrank;

import java.math.BigInteger;

/**
 * @author Jay Patel
 *
 */
public class BigIntegerFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		BigInteger q = BigInteger.valueOf(n);
		BigInteger one = new BigInteger("1");
		BigInteger result = factorial(q , one);
		System.out.print(result);
	}

	private static BigInteger factorial(BigInteger q, BigInteger one) {
		if(q.equals(new BigInteger("0"))){
			return one;
		}else{
			return q.multiply(
								factorial(q.subtract(one), one)
								);
		}
		
	}

}
