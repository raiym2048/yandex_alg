package com.example.yandex_alg;

import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    // 1. Two Sum
    public static void main(String[] args) {
        int[] array = new int[]{3,2,4};
        int[] result =  twoSum(array, 6);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {};
        }

}
