class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;

        String a = s;

        while(a.charAt(a.length() - 1) == ' '){
            a = a.substring(0, a.length() - 1);
        }

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != ' '){
                count++;
            }
            else{
                count = 0;
            }
        }
        return count;
        
    }
}