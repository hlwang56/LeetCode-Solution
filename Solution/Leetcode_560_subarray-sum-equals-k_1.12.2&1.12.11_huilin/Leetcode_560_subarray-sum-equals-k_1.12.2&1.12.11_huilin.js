/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function (nums, k){
  let ans = new Map();
  ans.set(0, 1);
  var sum = 0;
  var count = 0;
  for(var i = 0;i < nums.length;i++){
    sum += nums[i];
    count += ans.get(sum - k) || 0;
    ans.set(sum, (ans.get(sum) || 0) + 1);
  }
  return count;
};
