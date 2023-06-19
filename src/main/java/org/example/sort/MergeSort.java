package org.example.sort;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        int length = arr.length;

        if (length < 2) {
            return;
        }

        int l = length / 2;

        int[] left = new int[l];
        int[] right = new int[length - l];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[l + i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;

        int i = 0, k = 0, j = 0;
        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < l) {
            arr[k++] = left[i++];
        }

        while (j < r) {
            arr[k++] = right[j++];
        }
    }

}