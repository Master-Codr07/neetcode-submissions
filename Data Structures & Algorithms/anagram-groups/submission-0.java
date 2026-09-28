class Solution {
    private String getFrequencyString(String str){
        int Freq[] = new int[26]; //freq = [0,0,0,0,0,0,0,0,0,0,0,0...,0];

        for(char ch : str.toCharArray()){
            Freq[ch-'a']++; //freq[0]=2 for a       freq[1]=1 for b //aab
        }

        //Bulid The String now
        StringBuilder sb = new StringBuilder();

        char ch = 'a';

        for(int i : Freq){
            sb.append(ch);//a
            sb.append(i);//a2
            ch++;//move to b
        }
        return sb.toString();
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }

        HashMap<String , List<String> > map = new HashMap<>();

        for(String str : strs){
            String FrequencyString = getFrequencyString(str);//to get a2b1 a1b1c2 //Function Call

            if(map.containsKey(FrequencyString)){
                map.get(FrequencyString).add(str);
            }

            else{
                ArrayList<String> strlist = new ArrayList<>();

                strlist.add(str);
                map.put(FrequencyString,strlist);//store["aab"] in list form rather than single String
            }
        }

        return new ArrayList<>(map.values());
        
        
    }
}
