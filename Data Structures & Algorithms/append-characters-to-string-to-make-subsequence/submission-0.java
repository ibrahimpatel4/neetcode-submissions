class Solution {
    public int appendCharacters(String s, String t) {

        int count = 0;

        String a = s;

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        for(int b = j; b < t.length(); b++){
            a += t.charAt(b);
            count++;
        }

        return count;
    }
}