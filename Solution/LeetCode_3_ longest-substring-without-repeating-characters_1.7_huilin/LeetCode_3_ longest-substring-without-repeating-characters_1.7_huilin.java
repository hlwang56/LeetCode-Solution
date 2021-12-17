// https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] arr = new int[128];
        int left = 0;
        //int right = 0;
        int ans = 0;
        for(int right = 0;right < n;right++){
                arr[s.charAt(right)]++;
                while(arr[s.charAt(right)] > 1){
                    arr[s.charAt(left)]--;
                    left++;
                }
                ans = Math.max(right - left + 1, ans);
            }
        return ans;
    }
}
