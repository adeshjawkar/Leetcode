class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            boolean ans = false;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(nums[i]==nums[j]){
                    ans = true;
                }

            }
         if(ans == false) return nums[i];

        }
        return 1;
    }
}