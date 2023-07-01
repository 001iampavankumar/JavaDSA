package Strings.BasicPrograms;

import java.util.Scanner;

public class IndexCharacterPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = sc.nextInt();

        if(index<0 || index>s.length()-1){
            System.out.print("Invalid index");
            return;
        }
        System.out.println(s.charAt(index));
    }
}
