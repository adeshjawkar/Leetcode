class Solution {
    public boolean search(int[] nums, int target) {
        boolean flage = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                flage = true;
            }
        }
        return flage;
        
    }
}