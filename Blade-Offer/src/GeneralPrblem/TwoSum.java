package GeneralPrblem;

import java.util.HashMap;
import java.util.Hashtable;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 s = new Solution1();
		int[] t = {3,2,4};
		int[] r = new int[2];
			r=	s.twoSum(t, 5);
			System.out.println();
	}

}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
    	
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
    	for(int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            if(ht.containsKey(nums[i])){
                res[0] = ht.get(nums[i]);
                res[1] = i;
                return res;
            }else
                ht.put(difference,i);
        }
        return null;
    }
}