package com.wyp.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WYP
 * @date 2021-04-29 9:52
 */
public class T21 {

    public static int removeDuplicates(int[] nums) {

        int left = 0;
        for (int right = 1;right < nums.length;right++){
            if (nums[left] != nums[right]){
                nums[++left] = nums[right];
            }
        }
        return left+1;


    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
}
