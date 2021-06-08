/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/2/2021
 *   Time: 3:07 PM
 *   File: SequentialSearch.java
 */

package searching.implementation;

public class SequentialSearch<E> {

    public void search(E element, Iterable<E> arr) {
        boolean isFound = false;
        int i = 0;
        for (E e : arr) {
            i++;
            if (e.equals(element)) {
                System.out.println("Element is found in the given data structure at: " + i + "th position");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("element not found");
        }
    }

    public void searchArray(E element, E[] arr) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                System.out.println("Element is found in the given data structure at: " + (i + 1) + "th position");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("element not found");
        }
    }


}