package Dymic;

public class Trapping_Rain_Water42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {0,1,0,2,1,0,1,3,2,1,2,1};
		Solution42 solution = new Solution42();
		System.out.println(solution.trap(b));
	}

}

class Solution42 {
    public int trap(int[] height) {
    	//检查空值
    	if(height==null || height.length<2)
    		return 0;
    	
    	//找出最高的点和index
    	int max = 0;
    	int maxIndex = 0;
    	for(int i=0; i<height.length; i++) {
    		if(max<height[i]) {
    			max = height[i];
    			maxIndex = i;
    		}
    	}
    	
//    	System.out.println("max="+max+"  maxIndex="+maxIndex);
    	//分别从左边和右边到中心最高点，一路计算所覆盖的面积
    	int roof = 0;
    	int areaNum = 0;
    	for(int i=0; i<maxIndex; i++) {
    		if(roof<height[i])
    			roof = height[i];
    		areaNum += (roof - height[i]);
    	}
    	
    	roof = 0;
    	for(int i=height.length-1; i>=maxIndex; i--) {
    		if(roof<height[i])
    			roof = height[i];
    		areaNum += (roof - height[i]);
    	};
    	
        return areaNum;
    }
}