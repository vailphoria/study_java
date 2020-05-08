import java.io.*;

public class Playground {
	public static void main(String[] args) {
        
		try(FileWriter writer = new FileWriter("notes3.txt", true))
        {
           // ������ ���� ������
            String text = "Hello Gold!";
            writer.write(text);
            // ������ �� ��������
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 

}
