class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);

        if(numRows == 1) return result;

       for(int i= 1 ; i<numRows ; i++){
          List<Integer> prevlist = result.get(i-1);
          List<Integer> currentlist = new ArrayList<>();
          currentlist.add(1);

          
           for(int j =0 ; j<prevlist.size()-1;j++){
            currentlist.add(prevlist.get(j)+prevlist.get(j+1));

           }
           currentlist.add(1); 
           result.add(currentlist);

       }
       return result;

    }
}