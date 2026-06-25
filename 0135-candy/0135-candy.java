class Solution {
    public int candy(int[] ratings) {
        int[] arr = new int[ratings.length];
        int max_val = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0;i< ratings.length;i++){
            arr[i] = 1;
        }
        if(ratings == null || ratings.length == 0) return 0;
        if(ratings.length == 1) return 1;
        if(ratings[0] > ratings[1]){
            arr[0] = 1 + arr[1];
        }
       if(ratings[ratings.length - 1] > ratings[ratings.length - 2]){
        arr[arr.length - 1] = 1 + arr[arr.length - 2];
       }

       for(int i = 1;i <arr.length;i++){
           if(ratings[i] > ratings[i-1]){
            arr[i] = Math.max(arr[i],1 + arr[i-1]);
           }
       }
        for(int i = arr.length-2;i >= 0;i--){
           if(ratings[i] > ratings[i+1]){
            arr[i] =Math.max(arr[i], 1 + arr[i+1]);
           }
       }
        for(int i = 0;i<arr.length;i++){
            count += arr[i];
        }
        return count;
    }
}