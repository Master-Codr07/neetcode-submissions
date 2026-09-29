class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }

        HashMap<String , List<String> > map = new HashMap<>();


        for(String s : strs){//taking eat ,ate, tea

            char ca[] = s.toCharArray(); //eat becomes. [ e, a, t]
            Arrays.sort(ca);//[a,e,t];
            String key = String.valueOf(ca); //Key = aet;


            //main part
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
