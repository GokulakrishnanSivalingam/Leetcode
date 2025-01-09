class Solution {

    public int prefixCount(String[] words, String pref) {
        int c = 0;
        for (String w : words) {
            c += hasPrefix(w, pref);
        }
        return c;
    }
    private int hasPrefix(String str, String pref) {
        int i=0;
        for (i = 0; i < str.length() && i < pref.length(); i++) {
            if (str.charAt(i) != pref.charAt(i)) {
                return 0;
            }
        }
        if (i != pref.length()) {
            return 0; 
        }
        return 1;
    }
}
