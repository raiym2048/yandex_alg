package com.example.yandex_alg;

import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    // 1. Two Sum
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for (int i = 0;i < s.length()/2;i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
