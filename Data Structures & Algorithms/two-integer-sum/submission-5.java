class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valIndexesMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if(valIndexesMap.containsKey(diff)) {
                return new int[]{valIndexesMap.get(diff), i};
            }

            valIndexesMap.put(nums[i], i);
        }
        return new int[0];
    }
}
