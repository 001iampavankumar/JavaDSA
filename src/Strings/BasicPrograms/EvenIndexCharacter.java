package Strings.BasicPrograms;

import java.util.Scanner;
import java.util.HashSet;

public class EvenIndexCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = sc.nextLine();
        boolean res = false;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            if(i%2==0){
                set.add(s.charAt(i));
                res = true;
            }
        }
        for(int i:set){
            System.out.print((char)i+" ");
        }
        if(res==false){
            System.out.println();
            return;
        }
    }
}
