import java.io.*;

public class Playground {
	public static void main(String[] args) {
        String text ="";
        int words = 0;
		try(FileReader reader = new FileReader("notes3.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                 
                text += (char)c;
            }
            String[] subStr;
            subStr = text.split(" ");
            System.out.println(subStr.length);

        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 

}
