/**
 * @param {number[]} nums
 * @return {number}
 */
//https://leetcode-cn.com/problems/contiguous-array/

var findMaxLength = function(nums) {
    let ans = new Map();
    ans.set(0, -1);//initialize:(sum, index)
    var sum = 0;
    var l = 0;
    for(var i = 0;i < nums.length;i++){
        sum += nums[i] == 0? -1 : 1;
        if(ans.has(sum)){
            l = Math.max(l, i - ans.get(sum))
        }else{
            ans.set(sum, i);
        }
    }
    return l;

};
