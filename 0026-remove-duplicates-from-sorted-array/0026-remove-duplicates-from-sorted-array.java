class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int j=1; j<nums.length; j++){
            if(nums[count]!=nums[j]){
                count++;
                nums[count]=nums[j];
            }
        }
        
        return count+1;
        
    }
}