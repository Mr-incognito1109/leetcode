package leetcode.Easy;

import java.util.Set;
import java.util.HashSet;

// 3:48 PM 12/14/2023

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> number = new HashSet<>();

        for (int n : nums) {
            if(number.contains(n)){
                return true;
            }
            number.add(n);
        }
        return false;
        
    }
}

// Easy