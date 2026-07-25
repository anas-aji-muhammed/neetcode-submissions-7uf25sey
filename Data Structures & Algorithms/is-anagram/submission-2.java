class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(sMap.containsKey(c)){
                sMap.put(c, sMap.get(c)+1);
            }
            else{
                sMap.put(c, 1);
            }
        }

        Map<Character, Integer> tMap = new HashMap();
        for(int i=0; i<s.length(); i++){
            char c = t.charAt(i);
            if(tMap.containsKey(c)){
                tMap.put(c, tMap.get(c)+1);
            }
            else{
                tMap.put(c, 1);
            }
        }
        return sMap.equals(tMap);

    }
}
