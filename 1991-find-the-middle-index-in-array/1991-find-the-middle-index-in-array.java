class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
         //Bruetforce Approach
        // for(int i=0; i<n; i++){
        //     int left =0;
        //     int right =0;
        //     for(int j=0; j<i; j++){
        //         left += nums[j];
        //     }
        //     for(int k=i+1; k<n; k++){
        //         right += nums[k];
        //     }
        //     if(left==right){
        //         return i;
        //     }

        // }
        // return -1;
        int totalSum =0;
        for(int i=0; i<n; i++){
            totalSum += nums[i];

        }
        int leftSum=0;
        for(int i=0; i<n; i++){
            int rightSum = totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}