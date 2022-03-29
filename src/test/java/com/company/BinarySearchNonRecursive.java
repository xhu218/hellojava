package com.company;

import org.junit.Test;

/**
 * @desc 二分查询（非递归方式）
 * 案例：
 * {1,3,8,10,11,67,100}，编程实现二分查找，要求使用非递归方式完成。
 * @Author xw
 * @Date 2019/9/27
 */
public class BinarySearchNonRecursive {

    @Test
    public  void main() {
        int[] arr = {1, 3, 8, 10, 11, 67, 100};
        int index = binarySearch(arr, 67);
        if (index != -1) {
            System.out.println("找到了，下标为：" + index);
        } else {
            System.out.println("没有找到--");
        }
    }

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


    private static int binarySearch1(int[] arr, int target) {

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = (left + right)/2;
            if(arr[mid] == target)
                return  mid;
            if(arr[mid]>target){
                //left = left;
                right = mid-1;
            }else
            {
                left = mid+1;
                //right = right;
            }
        }
        return -1;

    }


}
