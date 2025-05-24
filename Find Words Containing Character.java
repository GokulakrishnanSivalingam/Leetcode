class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> avs=new ArrayList<>();
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            for(char c:words[i].toCharArray())
            {
              if(c==x)
              {
                avs.add(i);
                break;
              }
            }
        }
        return avs;
    }
}
