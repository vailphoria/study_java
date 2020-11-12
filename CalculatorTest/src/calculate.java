import java.util.Arrays;

public class calculate {
    String num1, num2, operand;
    boolean isNum = false;

    String[] romeNumbers = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

    public void setValues(String n1, String n2, String opr){
        num1 = n1;
        num2 = n2;
        operand = opr;

        isNum();
    }
    public void calc(int n1, int n2){
        double num3 =0;

        if (operand.equals("+")) num3 = n1+n2;
        else if (operand.equals("-")) num3 = n1-n2;
        else if (operand.equals("*")) num3 = n1*n2;
        else num3 = (double)n1/n2;

        if(isNum&&!operand.equals("/"))System.out.println((int)num3);
        else if (isNum)System.out.println(num3);
        else System.out.println(toRome((int)num3));
    }
    public void isNum() {
        int n1, n2;
        if (isDigit(num1) && isDigit(num2)) {
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);

            isNum = true;

            if (n1 <= 10 && n2 <= 10) calc(n1,n2);
            else System.out.println("Number(s) is(are) biggest then 10");

        } else if (Arrays.asList(romeNumbers).contains(num1)&&Arrays.asList(romeNumbers).contains(num2)){
            //System.out.println("yeah it's rome");

            n1=Arrays.asList(romeNumbers).indexOf(num1)+1;
            n2=Arrays.asList(romeNumbers).indexOf(num2)+1;
            calc(n1,n2);

        }else System.out.println("Your input is incorrect");

    }
    public static boolean isDigit(String str){
        char c = str.charAt(0);
        return Character.isDigit(c);
    }
    public String toRome(int ans){
        String ansStr = "";
        while (ans != 0){
            if(ans>=100){
                ans-=100;
                ansStr +="C";
            }else if(ans>=90){
                ans-=90;
                ansStr +="XC";
            }else if(ans>=50){
                ans-=50;
                ansStr +="L";
            }else if(ans>=40){
                ans-=40;
                ansStr +="XL";
            }else if(ans>=10){
                ans-=10;
                ansStr +="X";
            }else if(ans>=9){
                ans-=9;
                ansStr +="IX";
            }else if(ans>=5){
                ans-=5;
                ansStr +="V";
            }else if(ans>=4){
                ans-=4;
                ansStr +="IV";
            }else{
                ans-=1;
                ansStr +="I";
            }
        }
        return ansStr;
    }
}
