class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) return true;
        if(x<0 || x%10 == 0) return false;
        int val = x; 
        int temp = 0;
        int dig = 0;
        while(x>0) {
            temp = temp*10+(x%10);
            x /= 10;
        }
        if(temp == val) return true;
        return false;
    }
}
