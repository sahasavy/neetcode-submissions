class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> wordMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = new String(wordArr);

            if(wordMap.containsKey(sortedWord)) {
                List<String> words = wordMap.get(sortedWord);
                words.add(word);
                wordMap.put(sortedWord, words);
            } else {
                List<String> words = new ArrayList();
                words.add(word);
                wordMap.put(sortedWord, words);
            }
        }

        List<List<String>> results = new ArrayList();
        for(List<String> words : wordMap.values()) {
            results.add(words);
        }

        return results;
    }
}
