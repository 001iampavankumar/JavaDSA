package Strings.BasicPrograms;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter a string: ");
       String s = sc.nextLine();

        int i = 0;
        while(i<s.length()){
            if((int)s.charAt(i)>47 && (int)s.charAt(i)<58){
                System.out.print(s.charAt(i)+" ");
                i++;
            }
            else{
                i++;
            }

        }


    }
}
