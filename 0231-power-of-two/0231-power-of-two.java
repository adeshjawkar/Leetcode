class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean bool = false;
        if(n<0){
         bool = false;
        }
        else{
        for(int i=0; i<32; i++){
            if(1<<i == n){
            bool = true;
        }
        }
        }
        
        return bool;
        
    }
}