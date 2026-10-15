class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;

        int MaxArea =0;

        while(left<right){
            int length=Math.min(heights[left],heights[right]);
            int breadth=right-left;

            int area = length*breadth;

            MaxArea = Math.max(area,MaxArea);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return MaxArea;
        
    }
}
