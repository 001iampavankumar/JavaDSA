package Arrays.BasicPrograms;
import java.util.Scanner;
public class LargestRepeatingElement {
    static void mostRepeating(int[] a) {

        //take a hold of count
        //take a hold of minCount;
        int count = 1;
        int max = Integer.MIN_VALUE;
        int element = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {

            if (a[i - 1] == a[i]) {
                count++;
            } else {
                if (count > max && count > 1) {
                    max = count;
                    element = a[i - 1];
                }
                count = 1;
            }
        }
        if (count > max && count > 1) {
            element = a[a.length - 1];
        }

        if (element == Integer.MIN_VALUE) {
            System.out.println("No repeating elements found.");
            return;
        }
        System.out.println(element);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        mostRepeating(a);
    }
}
