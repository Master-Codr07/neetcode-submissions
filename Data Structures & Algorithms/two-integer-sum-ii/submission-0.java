class Solution {
    public int[] twoSum(int[] nums, int key) {
        int left=0;
        int right = nums.length-1;

        while(left<right){
            if(nums[left]+nums[right]==key){
                return new int [] {left+1,right+1};
            }

            else if(nums[left]+nums[right]>key){
                right--;
            }

            else{
                left++;
            }
        }

        return new int []{};
        
    }
}
