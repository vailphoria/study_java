/**
 * @author Valeri
 *
 */
public class Playground {
	public static String Tickets(int[] peopleInLine)
	{
		int d25 = 0, d50 = 0;
		for(int i=0;i<peopleInLine.length;i++) {
			switch (peopleInLine[i]) {
			case 25:
				d25++;
				continue;
			case 50:
				if(d25>0) {
					d25--;
					d50++;
					continue;
				}
				else return "NO";
			case 100:
				if(d25>0&&d50>0) {
					d25--;
					d50--;
					continue;
				}
				else if(d25>2) {
					d25-=3;
					continue;
				}
				else return "NO";
			  }	  
		  }
		  return "YES";
	  }
	public static void main(String[] args) {
		System.out.print(Playground.Tickets(new int[] {25, 25, 50}));
	}

}
