//https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length(), n = s.length();
        int[] arr = new int[26];
        List ans = new ArrayList();
        for(int i = 0;i < m;i++){
            arr[p.charAt(i) - 'a']--;
        }
        int left = 0;
        for(int right = 0;right < n;right++){
            arr[s.charAt(right) - 'a']++;
            while(arr[s.charAt(right) - 'a'] > 0){
                arr[s.charAt(left) - 'a']--;
                left++;
            }
            if(right - left + 1 == m){
                ans.add(left);
            }
        }
        return ans;

    }
}
