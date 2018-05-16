package GeneralPrblem;

public class Multiply_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution43 solution = new Solution43();
		System.out.println(solution.multiply("123", "456"));
//		solution.multiply("3", "16");
	}

}

class Solution43{
	 public String multiply(String num1, String num2) {
		 if(num1.equals("0")||num2.equals("0"))
			 return "0";
		 int len = num1.length()+num2.length();
		 int[] num_result = new int[len];
		 int num1_len = num1.length();
		 int num2_len = num2.length();
		 
		 for(int i=0; i<num1_len;i++) {
			 for(int j=0; j<num2_len; j++) {
//				 System.out.print("num1.charAt("+(num1_len-i)+")"+(num1.charAt(num1_len-i-1)-'0'));
//				 System.out.println("  num2.charAt("+(num2_len-j)+")"+(num2.charAt(num2_len-j-1)-'0'));
				 num_result[i+j] += ( (num1.charAt(num1_len-i-1)-'0')*(num2.charAt(num2_len-j-1)-'0') );
//				 System.out.println("num_result["+(i+j)+"] : "+num_result[i+j]);
			 }

//			 System.out.println("num_result["+(i+0)+"] : "+num_result[i+0]);
		 }
		 
//		 System.out.println("num_result["+(0+0)+"] : "+num_result[0+0]);
		 
//		 System.out.println("?");

//		 System.out.println("len:"+len+"  :"+num_result[0]);
//		 for(int i=len-1; i>=0; i--) {
//			 System.out.println(num_result[i]);
//		 }
		 int carry_last = 0;
		 for(int i=0; i<len; i++) {
//			 System.out.println("="+num_result[i]);

			 int carry_curr = (num_result[i] + carry_last)/10;
			 num_result[i] = (num_result[i] + carry_last)%10;
			 carry_last = carry_curr;
			 
		 }
		 
//		 for(int i=len-1; i>=0; i--)
//			 System.out.print(num_result[i]);
//		 
		 StringBuilder returnString = new StringBuilder("");
		 if(num_result[len-1]!=0)
			 returnString.append((char)(num_result[len-1]+'0'));
		 for(int i=len-2; i>=0; i--)
			 returnString.append((char)(num_result[i]+'0'));
	     return returnString.toString();
//		 return null;
	 }
}
