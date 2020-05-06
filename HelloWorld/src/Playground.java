/**
 * @author Valeri
 *
 */
public class Playground {
	public int solution(int number) {
		int sum = 0;
		for (int i = 0; i<number; i+=3) sum+=i;
		for (int i = 0; i<number; i+=5) {
			if (i%15 == 0)continue;
			else sum+=i;
		}
	    return sum;
		}
	public static void main(String[] args) {
	}

}
