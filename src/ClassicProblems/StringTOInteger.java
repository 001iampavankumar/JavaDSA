package ClassicProblems;
import java.math.BigInteger;
import java.util.Scanner;
public class StringTOInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        BigInteger a = new BigInteger(s);
        BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger longMin = BigInteger.valueOf(Long.MIN_VALUE);


        if(a.compareTo(longMax)>0){
            System.out.println(s+" can't be fitted anywhere.");
            return;
        }
        if(a.compareTo(longMin)<0){
            System.out.println(s+" can't be fitted anywhere.");
            return;
        }

        Long num = Long.parseLong(s);

        if(num>=Byte.MIN_VALUE && num<=Byte.MAX_VALUE){
            System.out.println(s+" can be fitted in:");
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
            return;
        }
        else if(num>=Short.MIN_VALUE && num<=Short.MAX_VALUE){
            System.out.println(s+" can be fitted in:");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
            return;
        }
        else if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE){
            System.out.println(s+" can be fitted in:");
            System.out.println("* int");
            System.out.println("* long");
            return;
        }
        else if(num>=Long.MIN_VALUE && num<=Long.MAX_VALUE){
            System.out.println(s+" can be fitted in:");
            System.out.println("* long");
            return;
        }
    }
}
