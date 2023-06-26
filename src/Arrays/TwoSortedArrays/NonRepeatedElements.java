package Arrays.TwoSortedArrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonRepeatedElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first array
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
        }

        // Read the second array
        int m = scanner.nextInt();
        int[] arrayB = new int[m];
        for (int i = 0; i < m; i++) {
            arrayB[i] = scanner.nextInt();
        }

        // Find non-repeated elements
        List<Integer> nonRepeatedElements = findNonRepeatedElements(arrayA, arrayB);

        // Print the non-repeated elements
        for (int element : nonRepeatedElements) {
            System.out.print(element + " ");
        }
    }

    private static List<Integer> findNonRepeatedElements(int[] arrayA, int[] arrayB) {
        List<Integer> nonRepeatedElements = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                nonRepeatedElements.add(arrayA[i]);
                i++;
            } else if (arrayA[i] > arrayB[j]) {
                nonRepeatedElements.add(arrayB[j]);
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < arrayA.length) {
            nonRepeatedElements.add(arrayA[i]);
            i++;
        }

        while (j < arrayB.length) {
            nonRepeatedElements.add(arrayB[j]);
            j++;
        }

        return nonRepeatedElements;
    }
}







/*
package Arrays.TwoSortedArrays;
import java.util.Scanner;
public class NonRepeatedElements {

    static void nonRepeated(int[] a1,int[] a2){
        int count = 0;
        //first array
        for(int i = 0;i<a1.length;i++){
            count = 0;
            for(int j = 0;j<a2.length;j++){
                if(a2[j]!=a1[i]){
                    count++;
                }

            }
            if(count == a2.length){
                System.out.print(a1[i]+" ");
            }
        }

        //2nd array
        for(int i = 0;i<a2.length;i++){
            count = 0;
            for(int j = 0;j<a1.length;j++){
                if(a1[j]!=a2[i]){
                    count++;
                }

            }
            if(count == a1.length){
                System.out.print(a2[i]+" ");
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        if (arr1.length == 0 || arr2.length == 0) {
            return;
        }

        nonRepeated(arr1,arr2);


    }

}
*/
