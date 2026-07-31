class Solution {
    public int maxArea(int[] heights) {
    int left  = 0  ;
    int  right =  heights.length-1;
    int maxarea =0;

    while(left<=right){
        if(heights[left]>heights[right]){
            maxarea= Math.max(maxarea,heights[right]*(right-left));
            right--;
        }
        else{
            maxarea= Math.max(maxarea,heights[left]*(right-left));
            left++;
        }
    }
    return maxarea;
    }
}
