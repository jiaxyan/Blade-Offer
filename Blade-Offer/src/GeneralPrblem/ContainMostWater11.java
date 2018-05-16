package GeneralPrblem;

public class ContainMostWater11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution11 s = new Solution11();
		int[] height = {1,2,3};
		System.out.println(s.maxArea(height));
	}

}

class Solution11{
    public int maxArea(int[] height) {
    	int l=0,r=height.length-1,maxS=0;
    	
    	while(l<r) {
    		maxS = Math.max(maxS, (r-l)*Math.min(height[l], height[r]));
    		//每当左边木板低  L就往右边走， 否则r往左边走
    		if(height[l]<height[r])
    			l++;
    		else
    			r--;
    	}
    	return maxS;
    }
}