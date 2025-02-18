class Solution {
    public String smallestNumber(String pattern) {
        
        StringBuilder sb=new StringBuilder();
        Stack<Integer>stack=new Stack<>();
    int n=pattern.length();
    int j=0;
    for(int i=0;i<=n;i++)
    {
 stack.push(i+1);
 if(i==n ||pattern.charAt(i)=='I')
 {
    while(j>0 ||!stack.isEmpty())
    {
        sb.append(stack.pop());
    }
 }
    }
    return sb.toString();
    }
}
