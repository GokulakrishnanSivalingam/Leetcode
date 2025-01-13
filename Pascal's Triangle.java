class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List <Integer>> a=new ArrayList<>(); 
        a.add(List.of(1));
        for(int i=0;i<numRows-1;i++)
        {
            List<Integer> b=new ArrayList<>();
            b.add(0);
            b.addAll(a.get(a.size()-1));
            b.add(0);
 List <Integer> c=new ArrayList<>(); 
            for(int j=0;j<b.size()-1;j++)
            {
                c.add(b.get(j)+b.get(j+1));
            }
            a.add(c);
        }
        return a;
    }
}
