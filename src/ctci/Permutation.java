/**
 * 
 */
package ctci;

/**
 * @author Jay Patel
 *
 */
public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String d = "1233";
		permute(d, 0, d.length());
	}
	
	public static void permute(String data, int l, int r) {
		if(l == r) {
			System.out.println(data); 
		}else {
			for(int i = l; i < r; i++) {
				data = swap(data, l, i);
				permute(data, l+1, r);
				data = swap(data, l, i);
			}
		}
	}
	
	
	
	public static String swap(String data, int source, int target) {
		char[] d = data.toCharArray();
		char c = d[source];
		d[source] = d[target];
		d[target] = c;
		return  new String(d);
	}
	

}
