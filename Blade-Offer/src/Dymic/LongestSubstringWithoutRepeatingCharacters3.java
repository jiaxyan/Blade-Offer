package Dymic;

public class LongestSubstringWithoutRepeatingCharacters3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 s3 = new Solution3();

//		int[] markIndex = new int[27];
		String s = "abba";
//		s = "duevopebpnrdzwrcaczqmzelnlvvwozakdvyvbakptpoqgqskrixqmkezfbwwaygfthauhnlcczsjsnvjvs";
		System.out.println("="+s3.lengthOfLongestSubstring(s));
	}

}

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
    	//判断空

    	int range = 256;
    	int[] markIndex = new int[range];
    	for(int i=0; i<range; i++)
    		markIndex[i] = -1;
    	
    	int lastIndex = -1 ,max = 0;
    	
        for(int i = 0; i<s.length(); i++) {
//        	System.out.println("At:"+i+" "+s.charAt(i));
        	int current_mark_index = s.charAt(i);
        	if(markIndex[current_mark_index]>lastIndex)
        		lastIndex = markIndex[current_mark_index];
        	
        	max = max>(i - lastIndex)?max:(i - lastIndex);
    		System.out.println("when i="+i+": "+max+"  lastIndex="+lastIndex);
    		markIndex[current_mark_index] = i;
        }
        return max;
    }
    
    public int lengthOfLongestSubstring(String s, int no_use) {
    	int start=0;
    	int[] map = new int[256];
    	for(int i=1; i<=s.length(); i++) {
    		int current = s.charAt(i-1);
    		
    	}
    	return 0;
    }
    /*
         public int lengthOfLongestSubstring(String s) {
    	//判断空
        if(s.length()<2)
            return s.length();
    	int range = 256;
    	int[] markIndex = new int[range];
    	for(int i=0; i<range; i++)
    		markIndex[i] = -1;
    	
//    	int curr_maxlen = 0, resu_maxlen = 0;
    	int lastIndex = -1 ,max = 0;
    	
        for(int i = 0; i<s.length(); i++) {
        	System.out.println("At:"+i+" "+s.charAt(i));
//        	int current_mark_index = s.charAt(i) -'a';
        	int current_mark_index = s.charAt(i);
        	if(markIndex[current_mark_index]==-1) {
        	}else {
//        		int gap = i - lastIndex;//markIndex[current_mark_index];
        		lastIndex = markIndex[current_mark_index];
        	}
        	max = max>(i - lastIndex)?max:(i - lastIndex);
//    		System.out.println("when i="+i+": "+resu_maxlen+"  curr_maxlen="+curr_maxlen);
    		markIndex[current_mark_index] = i;
        }
        return max;
    }
     */
}