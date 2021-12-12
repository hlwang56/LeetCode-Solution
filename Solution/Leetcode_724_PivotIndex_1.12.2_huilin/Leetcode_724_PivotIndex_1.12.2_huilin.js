/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    var sum = 0;
    var left = 0;
    for(var n of nums){
        sum = sum + n;
    }
    for(var i = 0;i < nums.length;i++){
        if(2 * left + nums[i] == sum){
            return i;
        }else{
            left += nums[i];
        }
    }
    return -1;


};
