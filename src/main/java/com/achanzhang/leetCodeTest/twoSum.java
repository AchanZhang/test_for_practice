package com.achanzhang.leetCodeTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSumCalculate(int[] nums, int target) {
        int[] res = new int[2];
        if (null == nums || 0 == nums.length) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,11,15,7};
        int target = 9;
        int[] res = twoSumCalculate(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
