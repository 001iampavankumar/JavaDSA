package Patterns.ChallengingOnes;
import java.util.*;

import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
//        int[][] a = new int[n][];
//
//        for(int i = 0;i<n;i++){
//
//            a[i] = new int[i+1];
//            a[i][0] = 1;
//
//            for(int j = 1;j<a[i].length-1;j++){
//
//                 a[i][j] = a[i-1][j-1]+a[i-1][j];
//            }
//            if(a[i].length>0){
//                a[i][a[i].length-1] = 1;
//            }
//
//            for(int space = 0;space<n-i;space++){
//                System.out.print(" ");
//            }
//            for(int j = 0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//
//        }

        System.out.println(generate(n));

    }

    static List<List<Integer>> generate(int n) {

        int[][] a = new int[n][];

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0;i<n;i++){

            a[i] = new int[i+1];
            a[i][0] = 1;

            for(int j = 1;j<a[i].length-1;j++){

                a[i][j] = a[i-1][j-1]+a[i-1][j];
            }
            if(a[i].length>0){
                a[i][a[i].length-1] = 1;
            }

            List<Integer> res = new ArrayList<>();
            for(int j = 0;j<a[i].length;j++){

                res.add(a[i][j]);
            }

            list.add(res);


        }

        return list;
    }

}
