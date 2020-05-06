/**
 * @author Valeri
 *
 */
public class Playground {
	static String encode(String word){
		word = word.toLowerCase();
		char[] arr = new char[word.length()];
		for (int i=0;i<word.length();i++) {
			int count=0;
			for (int j=0;j<word.length();j++) {
				if(word.charAt(i)==word.charAt(j))count++;
			}
			if (count>=2)arr[i]=')';
			else arr[i]='(';
		}
		return word.copyValueOf(arr);
	}
	public static void main(String[] args) {
		System.out.print(Playground.encode("Prespecialized"));
	}

}
