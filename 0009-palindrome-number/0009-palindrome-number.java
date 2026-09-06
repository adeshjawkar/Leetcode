class Solution {
    public boolean isPalindrome(int x) {
        
        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }
        int rev = rev(x);
        return rev == x;
        
    }
    public int rev(int n){
        int num=0;

        while(n!=0){
            int dig = n%10;
            num = num*10+dig;
            n = n/10; 
        }
        return num;
    }
}