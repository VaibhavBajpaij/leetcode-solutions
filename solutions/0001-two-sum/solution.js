/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let s=0;
    for(let i=0;i<nums.length;i++){
        for(let j=i+1;j<nums.length;j++){
            s=nums[j]+nums[i];
            if(s==target)  return [i,j];
            
        }
    }
    return 0;
    
};
