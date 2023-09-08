/**
Link : https://leetcode.com/problems/palindrome-number/
**/
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        int revision = 0;
        return reverseNumber(x, revision) == x;
    }

    private int reverseNumber(int x, int revision){
        if(x == 0){
            return revision;
        }
        int rem = x %10;
        revision = revision * 10 + rem;
        return reverseNumber(x/10, revision);
    }
}
