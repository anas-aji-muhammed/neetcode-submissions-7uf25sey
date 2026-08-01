class Solution {
    public int characterReplacement(String s, int k) {
         Map<Character, Integer> freq = new HashMap<>();
        int maxCount = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            
            // Increment frequency of the current character
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);
            
            // Keep track of the historical maximum frequency
            maxCount = Math.max(maxCount, freq.get(rightChar));
            
            // If the window is invalid, shift it right by 1
            if ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }
        }
        
        // The distance between left and the string's end represents the max valid window
        return s.length() - left;
    }
}
