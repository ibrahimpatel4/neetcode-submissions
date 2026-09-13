class Solution {
    public int scoreOfString(String s) {

        ArrayList<Integer> ascii = new ArrayList<Integer>();

        for(char a : s.toCharArray()){
            ascii.add((int) a);
        }

        int score = 0;

        for(int i = 0; i < ascii.size() - 1; i++){
            score += Math.abs(ascii.get(i+1) - ascii.get(i));
        }

        return score;
        
    }
}