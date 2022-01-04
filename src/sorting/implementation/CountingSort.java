/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 15-Dec-21
 *   Time: 7:25 PM
 *   File: CountingSort.java
 */

package sorting.implementation;

import java.util.Arrays;

public class CountingSort {

    public static int[] sort(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        int[] b = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            b[arr[i]]++;
        }

        for (int i = 1; i < b.length; i++) {
            b[i] = b[i] + b[i-1];
        }
        int[] c = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            c[b[arr[i]]-1] = arr[i];
            b[arr[i]]--;
        }
        System.out.println(Arrays.toString(c));
        return c;
    }
}