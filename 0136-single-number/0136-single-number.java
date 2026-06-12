class Solution {
    public int singleNumber(int[] nums) {
        //method-1 Bruet force
        // for(int i=0; i<nums.length; i++){
        //     boolean flag = false;
        //     for(int j=0; j<nums.length; j++){
        //         if(i==j) continue;
        //         if(nums[i]==nums[j]){
        //             flag = true;

        //         }
                
        //     }
        //     if(flag == false) return nums[i];

        // }
        // return 1;

        //method-2 Using Sorting
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
                if(nums[i] != nums[i+1])   return nums[i];
                i += 2;
        }
        return nums[nums.length-1];

        
    }
}