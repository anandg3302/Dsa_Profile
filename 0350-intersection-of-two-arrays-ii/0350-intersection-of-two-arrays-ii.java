class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                ans.add(nums2[i]);

                int freq = map.get(nums2[i]) - 1;

                if (freq == 0)
                    map.remove(nums2[i]);
                else
                    map.put(nums2[i], freq);
            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}