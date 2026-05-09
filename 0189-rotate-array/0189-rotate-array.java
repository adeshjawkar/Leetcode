class Solution {
    public static void swap(int[] arr, int i, int j){
        while(i<j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n){
            k = k%n;
        }
        
        swap(nums,0,n-k-1);
        swap(nums,n-k,n-1);
        swap(nums,0,n-1);
        
    }
}