package com.leetcode;

import java.util.Arrays;

/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo0001 {
//    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 5};
//        System.out.println(Arrays.toString(twoSum(nums, 9)));
//    }

    public int[] twoSum(int[] nums, int target) {
        int num1;
        int[] ans = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num1 + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
            if (ans[1] != 0) {
                break;
            }
        }
        return ans;
    }
}
