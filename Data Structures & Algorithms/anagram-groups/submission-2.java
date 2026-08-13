class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String string : strs) {
            int[] count = new int[26];
            for(Character c : string.toCharArray()){
                count[c - 'a'] += 1;
            }
            String key = Arrays.toString(Arrays.stream(count).toArray());
            if(!anagramGroups.containsKey(key)){
                anagramGroups.put(key, new ArrayList<>());
            }
            anagramGroups.get(key).add(string);

        }
        return new ArrayList<>(anagramGroups.values());
    }
}
