class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right = s.length()-1;

        while(left<right){

            //remove all , . 
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; //if its a non digit non letter move to next
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--; //if its a non digit non letter move back one step
            }

            //if passed its confrimed that the left char and right char are either letter /digit
            if(Character.toLowerCase(s.charAt(left))  != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }

        return true;


        
}

     
}
