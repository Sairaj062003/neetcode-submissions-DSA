class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let left  = 0; 
        let right = heights.length-1;
        let areamax =0;

        while(left<right){
        if(heights[left]>heights[right]){
            areamax= Math.max(areamax,heights[right]*(right-left));
            right--;
        }
        else{
           areamax= Math.max(areamax,heights[left]*(right-left));
            left++;
        }
    }
     return areamax;
            
        }
       

    }    

