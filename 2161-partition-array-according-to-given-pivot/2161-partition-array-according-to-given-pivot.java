class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for(int num : nums){
            if(num < pivot){
                small.add(num);
            }
            else if( num == pivot){
                equal.add(num);
            }
            else{
                greater.add(num);
            }
        }
        int idx = 0;
        int[] arr = new int[nums.length];
        for(int x : small){
           arr[idx] = x;
           idx++;
        }
        for(int x : equal){
            arr[idx] = x;
            idx++;
        }
        for(int x : greater){
            arr[idx] = x;
            idx++;
        }
        return arr;  
    }
}