package org.example.search;

public class TernarySearch {

    public static int ternarySearch(int[] arr, int target) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid1 = first + (last - first) / 3;
            int mid2 = last - (last - first) / 3;

            if (target == arr[mid1])
                return mid1;
            if (target == arr[mid2])
                return mid2;
            if (target > arr[mid1])
                first = mid1 + 1;
            else if (target < arr[mid2])
                last = mid2 - 1;
            else {
                first = mid1 - 1;
                last = mid2 + 1;
            }

        }

        return -1;
    }

}