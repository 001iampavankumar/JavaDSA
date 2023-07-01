package Strings.BasicPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class CharacterPrinting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = sc.nextLine();
        boolean res = false;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){

            if((int)s.charAt(i)>64 && (int)s.charAt(i)<91 || (int)s.charAt(i)>96 && (int)s.charAt(i)<123){
                res = true;
                set.add(s.charAt(i));
            }
        }

        for(int i:set){
            System.out.print(i);
        }
        if(res!=true){
            System.out.println("No valid characters found.");
        }
    }
}
