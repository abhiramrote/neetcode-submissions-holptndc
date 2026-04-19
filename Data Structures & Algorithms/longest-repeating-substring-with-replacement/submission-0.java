class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];  
        int left = 0, maxLen = 0, maxFreq = 0;
        for(int right = 0; right < s.length(); right++) {
            // ADD right char
            char ch = s.charAt(right);
            int idx = ch - 'A';
            count[idx]++;
            maxFreq = Math.max(maxFreq, count[idx]);  // Track max in window
            
            // SHRINK if invalid
            while((right - left + 1) - maxFreq > k) {
                count[s.charAt(left++) - 'A']--;
            }
            
            // UPDATE result
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;        
    }
}
