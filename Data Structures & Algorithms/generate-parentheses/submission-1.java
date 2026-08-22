class Solution {
    List<String> result;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        String str = "";
        int open = n;
        int close = n;
        validparenthesis(str,open,close);
        return result;
    }

    private void validparenthesis( String str,int open,int close){

        

        if(open==0 && close==0) {
            result.add(str);
            return;
        }

        if(close < open){
            result.remove(str);
            return;
        }
       

        StringBuilder str1 = new StringBuilder(str);
        StringBuilder str2 = new StringBuilder(str);

       if(open>0)  validparenthesis(  str1.append('(').toString() , open-1, close);

        if(close>0)  validparenthesis(  str2.append(')').toString() , open, close-1);


    }
}
