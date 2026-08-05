import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(i, candidates, target - candidates[i], current, ans);
            current.remove(current.size() - 1);
        }
    }
}

// List<List<Integer>> ans = new ArrayList<>();
// backtrack(0,cand,target,new ArrayList<>(),ans);
// backtrack(int start,int[] can,int target,List<Integer> curr,List<List<Integer>> ans){
//     if(target == 0){
//         ans.add(new ArrayList<current));
//         return;
//     }
//     if(target < 0){
//         return;
//     }
//     for(int i = start;i<cand.lengt;i++){
//         current.add(cand[i]);
//         backtrack(i,cand,target - cand[i],curr,ans);
//         curr.remove(curr.size() - 1);
//     }
// }
