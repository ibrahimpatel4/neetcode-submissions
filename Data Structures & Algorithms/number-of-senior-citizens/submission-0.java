class Solution {
    public int countSeniors(String[] details) {

        String a = "";
        int abovesixty = 0;

        for(int i = 0; i < details.length; i++){
            a = String.valueOf(details[i].charAt(11)) + String.valueOf(details[i].charAt(12));
            if(Integer.parseInt(a) > 60){
                abovesixty++;
            }
            a = "";

        }
        return abovesixty;
        
    }
}