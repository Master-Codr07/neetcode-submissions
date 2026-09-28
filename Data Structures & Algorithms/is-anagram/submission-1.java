class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        //for string s
        int n1= s.length();
        HashMap<Character,Integer> map1 = new HashMap<>();

        for(int i=0;i<n1;i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i), 0)+1);
        }

        //for String t
        int n2 = t.length();

        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int j=0;j<n2;j++){
            map2.put(t.charAt(j),map2.getOrDefault(t.charAt(j), 0)+1);
        }

        return map1.equals(map2);





       

            



    }
}
