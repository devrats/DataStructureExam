/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/2/2021
 *   Time: 3:52 PM
 *   File: BinarySearch.java
 */

package searching.implementation;


public class BinarySearch {
    public void search(int element, int[] arr, int size) {
        boolean isFound = false;
        int lowerLimit = 0;
        int upperLimit = size - 1;
        while (lowerLimit <= upperLimit) {
            int mid = (lowerLimit + upperLimit) / 2;
            if (arr[mid] == element) {
                System.out.println("element is founded at: " + (mid + 1) + "th position");
                isFound = true;
                break;
            } else if (arr[mid] < element) {
                lowerLimit = mid + 1;
            } else {
                upperLimit = mid - 1;
            }
        }
        if (!isFound){
            System.out.println("element not found");
        }
    }
}