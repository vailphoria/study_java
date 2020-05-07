/**
 * @author Valeri
 *
 */
import java.util.*;

public class Playground {
	public static void main(String[] args) {
		int value = 5689;
		String RomNum = "";
		int[] num = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letter = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        //Map< String,  Integer>  map =  new HashMap<String,  Integer>();
        //for ( int i= 0;  i <  num.length;  i++) map.put( letter[ i],  num[ i]);  // insert key/value into map
        for (int i=0; i<num.length; i++) {
        	while(value>=num[i]) {
        		value -= num[i];
        		RomNum += letter[i];
        	}
        }
		System.out.print(RomNum);
	}

}
