class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>>  groups = new HashMap<>();

         for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(groups.containsKey(sorted)){
                groups.get(sorted).add(str);
            }
            else{
                List<String> resultList = new ArrayList<>();
                resultList.add(str);
                groups.put(sorted, resultList);
            }
         }
         return groups.values().stream().toList();
    }
}
