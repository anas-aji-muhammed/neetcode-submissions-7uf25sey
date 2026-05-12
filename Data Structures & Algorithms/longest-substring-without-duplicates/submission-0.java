class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> seen = new HashSet<>();
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            // Shrink the window if there's a duplicate
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            // Expand the window
            seen.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
        
    }
}
