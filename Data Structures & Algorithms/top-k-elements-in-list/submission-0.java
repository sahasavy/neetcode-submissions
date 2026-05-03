class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> digitCountMap = new HashMap<>();
        int[] results = new int[k];

        for(int num : nums) {
            digitCountMap.put(num, digitCountMap.getOrDefault(num, 0) + 1);
        }

        List<int[]> sortedCountList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entryMap : digitCountMap.entrySet()) {
            int digit = entryMap.getKey();//1,2,3
            int count = entryMap.getValue();//1,3,5

            sortedCountList.add(new int[]{count, digit});
            sortedCountList.sort((a,b) -> b[0] - a[0]);
            //[]-->{[5,3], [3,2], [1,1]}
        }

        for(int i = 0 ; i < k ; i++) {
            // int[] arr = sortedCountList.get(i);
            results[i] = sortedCountList.get(i)[1];
        }

        return results;
    }
}
