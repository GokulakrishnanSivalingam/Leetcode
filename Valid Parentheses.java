class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='['|| s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));  
            }
           else if(s.charAt(i)=='}' || s.charAt(i)==']'|| s.charAt(i)==')')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top=stack.pop();  
                if(!match(top,s.charAt(i)))
                {
 return false;
                }
            }
        }
        return stack.isEmpty();

    }
        private boolean  match(char open ,char close)
        {
            return (open =='{'&& close =='}') ||(open =='['&& close ==']')|| (open =='('&& close ==')');

        }
    
}
