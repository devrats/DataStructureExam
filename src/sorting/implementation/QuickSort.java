//package sorting.implementation;
//import java.util.*;
//
//public class QuickSort {
//    public static void main(String args[]) {
//        int [] arr = {5,3,2,6,4,1,3,7};
//        System.out.println(Arrays.toString(arr));
//        quickSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void quickSort(int arr[], int start, int end){
//        System.out.println(start);
//        System.out.println(end);
//        if(start<end){
//            int pivot = partition(arr, start, end);
//            quickSort(arr, start, pivot);
//            quickSort(arr, pivot+1, end);
//        }
//    }
//
//    public static int partition(int a[], int start, int end){
//        int element = a[start];
//        int i = start;
//        int j = end;
//        while(true){
//            while(a[j]>element){
//                j--;
//            }
//            while(a[i]<element){
//                i++;
//            }
//            if(i<j){
//                int temp = a[j];
//                a[j] = a[i];
//                a[i] = temp;
//            } else{
//                return j;
//            }
//        }
//    }
//
//}

/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/8/2021
 *   Time: 10:17 PM
 *   File: QuickSort.java
 */

package sorting.implementation;

public class QuickSort {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int partition(int[] arr, int lowerLimit, int upperLimit)
    {
        int pivot = arr[lowerLimit];
        int i=lowerLimit-1, j=upperLimit+1;
        while (i<j){
            do {
                i++;
            } while (arr[i]<pivot);
            do {
                j--;
            } while (arr[j]>pivot);
            if(j>i){
                swap(arr,i,j);
            }
        }
        return j;
    }

    public static void sort(int[] arr, int lowerLimit, int upperLimit)
    {
        if (lowerLimit < upperLimit)
        {
            int pivot = partition(arr, lowerLimit, upperLimit);
            sort(arr, lowerLimit, pivot);
            sort(arr, pivot + 1, upperLimit);
        }
    }
}
