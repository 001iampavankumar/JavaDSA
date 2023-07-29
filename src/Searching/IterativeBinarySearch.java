package Searching;

import java.util.*;

public class IterativeBinarySearch {


    static int search(List<Integer> arr,int target){

        int low = 0;
        int high = arr.size()-1;

        while(low<=high){

            int mid = (low + high)/2;

            if(arr.get(mid)==target){

                return mid;
            }

            else if(arr.get(mid)>target){
                high = mid - 1;
            }
            else {
                low = mid+1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = scan.nextInt();
        for(int i = 0;i<n;i++){

            arr.add(scan.nextInt());
        }

        System.out.println(search(arr,scan.nextInt()));
    }
}
