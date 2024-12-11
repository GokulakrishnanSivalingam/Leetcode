import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {   
        int t;
        int s=0;
        int r;
        t=x;
        while(x>0)
        
        {
            r=x%10;
            s=(s*10)+r;
            x=x/10;
        }
        if(t==s)
        {
            return true;
        }
        else{
           return false;
        }
    
    }
}
