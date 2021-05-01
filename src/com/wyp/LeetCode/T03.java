package com.wyp.LeetCode;

/**
 * @author WYP
 * @date 2021-04-30 23:40
 */
public class T03 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);

    }

    public static void rotate(int[] nums, int k) {
        int tmp;
        for (int i=1;i<=k;i++){
            int j=nums.length-1;
            tmp = nums[j];
            for (;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = tmp;
        }
        System.out.print('[');
        for (int i : nums){
            System.out.print(i+",");
        }
        System.out.print(']');
    }
}
