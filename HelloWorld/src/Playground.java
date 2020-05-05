/**
 * @author Valeri
 *
 */
public class Playground {

	public static int findShort(String s) {
		int n = s.length();
		for (String retval : s.split(" ")) {
        	if (retval.length()< n) {
        		n = retval.length();
        	}
        }
		return n;		
	}
	public static void main(String[] args) {

	}

}
