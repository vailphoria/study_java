/**
 * @author Valeri
 *
 */
public class Playground {
	public static String printerError(String s) {
		int errors = 0;
		String allErr = "nopqrstuvwxyz";
		for (int i=0;i<s.length();i++) {
			for (int j=0;j<allErr.length();j++) {
				if (s.charAt(i)==allErr.charAt(j)) {
					errors++;
					break;
				}
			}
		}
		return s.format("%d/%d",errors,s.length());
	}
	public static void main(String[] args) {
		System.out.print(Playground.Tickets(new int[] {25, 25, 50}));
	}

}
