class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Arrays.sort(nums);
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) >= 2)
                    count++;
            } else if (map.containsKey(key + k)) {
                count++;
            }
        }
        return count;
    }

}
