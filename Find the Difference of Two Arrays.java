class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> avs=new ArrayList<>();
       
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
         
      for(int n:nums1)
      {
    h1.add(n);
      }
       for(int n:nums2)
      {
      h2.add(n);
      }
      List<Integer> avs1=new ArrayList<>(h1);
        List<Integer> avs2=new ArrayList<>(h2);
        List<Integer> avs3=new ArrayList<>();
        List<Integer> avs4=new ArrayList<>();
       for(int i=0;i<avs1.size();i++)
      {
        if(!h2.contains(avs1.get(i)))
        {
            avs3.add(avs1.get(i));
        }
      }
      for(int i=0;i<avs2.size();i++)
      {
        if(!h1.contains(avs2.get(i)))
        {
            avs4.add(avs2.get(i));
        }
      }
      avs.add(avs3);
      avs.add(avs4);
        return avs;
    }
}
