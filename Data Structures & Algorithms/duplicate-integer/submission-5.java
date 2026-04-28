class Solution {
    public boolean hasDuplicate(int[] nums) {

        if(nums == null || nums.length == 0) {
            return false;
        }

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++) {
            if(numMap.containsKey(nums[i])) {
                return true;
            }
            numMap.put(nums[i], nums[i]);
        }

        return false;
    }
}