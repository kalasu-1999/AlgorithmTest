package com.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

示例 2:
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

示例 3:
输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution solution = new Solution();
        int i = solution.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int maxLen = 0;

// 方法２：
        int i = 0;
        int temp;
        for (int k = 0; k < chars.length; k++) {
            if (k != i) {
                for (int p = i; p < k; p++) {
                    if (chars[p] == chars[k]) {
                        temp = k - i;
                        if (temp > maxLen) {
                            maxLen = temp;
                        }
                        i = p + 1;
                        break;
                    }
                }
            }
        }
        temp = chars.length - i;
        if (temp > maxLen) {
            maxLen = temp;
        }


// 方法１：
//        ArrayList<Character> characters = new ArrayList<>();
//        for (char c : chars) {
//            if (characters.isEmpty()) {
//                characters.add(c);
//            } else {
//                int position = characters.indexOf(c);
//                if (position >= 0) {
//                    if (characters.size() > maxLen) {
//                        maxLen = characters.size();
//                    }
//                    if (characters.size() == position + 1) {
//                        characters = new ArrayList<>();
//                    } else {
//                        characters.subList(0, position+1).clear();
//                    }
//                }
//                characters.add(c);
//            }
//        }
//        if (characters.size() > maxLen) {
//            maxLen = characters.size();
//        }
        return maxLen;
    }
}
