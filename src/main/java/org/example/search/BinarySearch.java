package org.example.search;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (right + left)/2;
        int result = -1;

        while (left<=right) {
            if (arr[mid]<key) {
                left = mid + 1;
            } else if (arr[mid]==key) {
                result = mid;
                right = mid - 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }

        return result;
    }

}