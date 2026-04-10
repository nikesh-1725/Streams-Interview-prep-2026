package com.example.MultipleCompanies;

import java.util.ArrayList;
import java.util.List;

public class DSA {

//    Input: candidates = [2,3,6,7], target = 7
//    Output: [[2,2,3],[7]]Explanation:2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//7 is a candidate, and 7 = 7.
//    These are the only two combinations.
//    Example 2:
//    Input: candidates = [2,3,5], target = 8
//    Output: [[2,2,2,2],[2,3,3],[3,5]]
//    Example 3:
//    Input: candidates = [2], target = 1
//    Output: []
    public static void main(String[] args) {

        int[] candidates={2,3,6,7};
        int target=7;

        combiningSum(candidates, target);

    }

    private static void combiningSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        findTheData(candidates, target,0,new ArrayList<>(),result);
        System.out.println(result);

    }

    private static void findTheData(int[] candidates, int target, int start, ArrayList<Integer> temp, List<List<Integer>> result) {
// {2,3,6,7}
        for(int i=start;i<candidates.length;i++){
            if(target==0){
                result.add(new ArrayList<>(temp));
                return;
            }
            if(candidates[i]>target){
                continue;
            }
            temp.add(candidates[i]);
            findTheData(candidates,target-candidates[i],i,temp,result);
            temp.remove(temp.size()-1);


        }

    }

    // Pick 2 -> t->5
    // pick 2 -> t->3
    // pick 3-> t->1
    // pick 3-> t->0

}
