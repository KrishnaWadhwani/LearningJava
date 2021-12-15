package com.javacourse;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args){
        System.out.println(findMedianSortedArrays(new int[] {}, new int[] {3, 4}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // initializing variable
        int count = 0;
        int mid = 0;
        double ans = 0;
        // initializing new array "a"
        int[] a = new int[(nums1.length+nums2.length)];
        // combining 2 arrays
        for (int i = 0 ; i < nums1.length ; i++, count++){
            a[i] = nums1[i];
        }
        for (int i = 0 ; i < nums2.length ; i++, count++){
            a[count] = nums2[i];
        }
        // sorting new array "a"
        Arrays.sort(a);
        // finding median
        mid = a.length / 2;
        if (a.length%2==0){
            ans = (double)(a[mid] + a[mid - 1])/2;
        }
        else {
            ans = a[mid];
        }
        // returning ans
        return ans;
    }
}
