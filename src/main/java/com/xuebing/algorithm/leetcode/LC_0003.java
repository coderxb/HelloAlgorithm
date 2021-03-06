package com.xuebing.algorithm.leetcode;

/**
 * Longest Substring Without Repeating Characters
 *
 * @ClassName LC_0003
 * @Description Given a string, find the length of the longest substring without repeating characters. For example, the
 * longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest
 * substring is "b", with the length of 1.
 *
 * @author gordon.li coderxb@163.com
 * @date 2015年5月4日 下午4:32:02
 */
public class LC_0003 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals(""))
            return 0;
        int sLen = s.length();
        if(sLen == 1) return 1;
        
        StringBuilder sb = new StringBuilder();
        int maxLen = 1;
        for (int i = 0; i < sLen; i++) {
            char charAt = s.charAt(i);
            if (sb.indexOf(String.valueOf(charAt)) <= -1) {
                sb.append(charAt);
            } else {
                if (maxLen < sb.length()) {
                    maxLen = sb.length();
                }
                sb.delete(0, sb.indexOf(String.valueOf(charAt)) + 1);
                sb.append(charAt);
            }
        }
        if (maxLen < sb.length()) {
            maxLen = sb.length();
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LC_0003 solution = new LC_0003();
        int len = solution.lengthOfLongestSubstring("dvdf");
        System.out.println("longest substring = " + len);
    }

}
