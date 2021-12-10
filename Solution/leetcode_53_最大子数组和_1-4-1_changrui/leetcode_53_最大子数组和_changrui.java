import java.util.*;
/** 
created by changrui 2021/12/10
https://leetcode-cn.com/problems/maximum-subarray/
给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
子数组 是数组中的一个连续部分。
*/
class leetcode_53_最大子数组和_changrui{
    public static void main(String[] args) throws Exception {
        //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //int[] nums = {1};
        int[] nums = {5,4,-1,7,8};

        Solution s =new Solution();
        System.out.println(s.maxSubArray(nums));
    }
}

class Solution{
    public int maxSubArray(int[] nums) {
        int maxSum = -100000000, sumCurr = 0;
        int sizeArray = nums.length;
        for (int i=0; i<sizeArray; i++)
        {
            if (sumCurr>0)
            {
                sumCurr += nums[i];
            }
            else
            {
                sumCurr = nums[i];
            }
            maxSum = Math.max(maxSum,sumCurr);
        }
        return maxSum;
    }   


}



