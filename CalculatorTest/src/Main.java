import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] split = input.split(" ");
        String operand=split[1];

        if(operand.equals("+")||operand.equals("-")||operand.equals("*")||operand.equals("/")){
            calculate ex = new calculate();
            ex.setValues(split[0],split[2],operand);
        }
        else {
            System.out.println("your operand is incorrect");
        }

    }
}
