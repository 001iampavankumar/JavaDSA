package Arrays.BasicPrograms;
import java.util.Scanner;
public class MostRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int max = a[n - 1];

        int[] ca = new int[max+1];
        for(int i = 0; i < a.length; i++) {
            ca[a[i]]++;
        }

        int count = 0;
        int ele = -1;
        for(int i = 0; i < a.length; i++){
            if(ca[a[i]] > count){
                count = ca[a[i]];
                ele = a[i];
            }
        }

        if (count <= 1) {
            System.out.println("No repeating element found");
        } else {
            System.out.println(ele);
        }

    }
}

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }

        int[] ca = new int[max+1];
        for(int i = 0;i<a.length;i++) {
            ca[a[i]]++;
        }
        int count = 1;
        int ele = -1;
        for(int i = 0;i<a.length;i++){
            if(ca[a[i]]>1 && count<ca[a[i]]){
                count = ca[a[i]];
                ele = a[i];
            }
        }
        System.out.println(ele);

    }*/

    /*static void mostRepeating(int[] a){

        //take a hold of count
        //take a hold of minCount;
        int count = 1;
        int max = Integer.MIN_VALUE;
        int element = -1;

        for(int i = 1;i<a.length;i++){

            if(a[i-1]==a[i]){
                count++;
            }
            else{
                if(count>max && count>1){
                    max = count;
                    element = a[i-1];
                }
                count = 1;
            }
        }
        if(count>max && count>1){
            element = a[a.length-1];
        }

        if(element == -1){
            return;
        }
        System.out.println(element);


    }
    // 1 1 2 2 3 3 4 4 5 5 6 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        mostRepeating(a);
    }
}
*/