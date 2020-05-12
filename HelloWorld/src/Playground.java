import java.io.*;

public class Playground {
	public static String createPhoneNumber(int[] numbers) {
		String number = "(";
		for (int i=0; i<10; i++){
			if (i==3)number+=") ";
			if (i==6)number+="-";
			number+=numbers[i];
		}
		return number;
	}
	
	public static void main(String[] args) {
		 System.out.print(Playground.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    } 

}
