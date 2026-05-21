class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] a = new int[n/2];
        int[] b = new int[n/2];
        //int[] ans = new int[n];
        int j=0;
        int k=0;
        for(int i=0; i<n; i++){ 
            if(nums[i]>0){
                a[j]=nums[i];
                j++;

            }
            else{
                b[k]=nums[i];
                k++;
            }

        }
        int p=0;
        int q=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                nums[i]=a[p];
                p++;
            }
            else{
                nums[i]=b[q];
                q++;

            }
        }
       
        return nums;
        
    }
}