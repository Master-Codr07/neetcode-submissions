class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int MaxStreak=0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            

            if(!set.contains(num-1)){
                int currentNum=num;
                int LongestStreak=1;

                while(set.contains(currentNum+1)){
                LongestStreak++;
                currentNum++;
            }

            MaxStreak=Math.max(MaxStreak,LongestStreak);
            }

            
            
        }

        return MaxStreak;

        
    }
}
