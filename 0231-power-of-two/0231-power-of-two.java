class Solution {
    public boolean isPowerOfTwo(int n) {
        // boolean bool = false;
        // if(n<0){
        //     bool = false;
        // }
        // else{
        //     for(int i=0; i<31; i++){
        //         if(1<<i == n) {
        //             bool = true;
        //         }
        //     }
        // }
        // return bool;
        return n>0 && (n & (n-1))==0;
        
    }
}