class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() !=  t.length()) {
            return false;
        }

        Map<Character, Integer> charMap = new HashMap<>();

        for(int i = 0; i< s.length() ; i++) {
            char ch = s.charAt(i);
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        for(int j = 0; j< t.length() ; j++) {
            char ch = t.charAt(j);

            if (charMap.containsKey(ch)) {
                int charCount = charMap.get(ch);

                if (charCount == 1) {
                    charMap.remove(ch);
                } else {
                    charMap.put(ch, charMap.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        if(charMap.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
