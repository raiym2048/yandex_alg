package com.example.yandex_alg;

import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    // 1. Two Sum
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int x = 0;
        for (int i = 0;i < s.length();i++){
            if (roman.containsKey(s.charAt(i))){
                int value =  roman.get(s.charAt(i));
                if (i+1<s.length() && value < roman.get(s.charAt(i+1))){
                    value = roman.get(s.charAt(i+1)) - value;
                    x += value;
                    i++;
                }
                else {
                    x+= value;
                }
            }
        }
        return x;
    }

}
