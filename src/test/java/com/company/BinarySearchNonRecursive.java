package com.company;

import org.junit.Test;

public class BinarySearchNonRecursive {

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1; // 向左找
            } else {
                left = mid + 1; // 向右找
            }
        }
        return -1;
    }


    @Test
    public void main() {
        int[] arr = {1, 3, 8, 10, 11, 67, 100};
        int index = binarySearch(arr, 67);
        if (index != -1) {
            System.out.println("找到了，下标为：" + index);
        } else {
            System.out.println("没有找到--");
        }
    }


}
