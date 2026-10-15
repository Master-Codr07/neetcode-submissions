class Solution {
    public int trap(int[] height) {
        //two pointer
        int left=0;
        int right=height.length-1;

        int LeftMax=0;
        int RightMax=0;

        int answer=0;

        while(left<right){

            LeftMax=Math.max(LeftMax,height[left]);
            RightMax=Math.max(RightMax,height[right]);


            if(LeftMax<RightMax){
                //left max is smaller
                answer = answer + (LeftMax-height[left]);
                left++;
            }
            else{
                answer=answer+(RightMax-height[right]);
                right--;
            }
        }

        return answer;

        
    }
}
