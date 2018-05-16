package Dymic;

public class LS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "awewsss";
		String b = "wewsss";
		SolutionLS ls = new SolutionLS(a,b);
	}

}

/**
 *生成矩阵来记录
 *简单：a[i]和b[j]相同记为1 不同记为0  最后寻找最长对角1的连线
 *优化：相同记为左上角值+1.不同记为0，同时记录最大值
 *优化后方便找到最大值
 *
 *首先：
 *用一个矩阵来记录两个字符串中所有位置的两个字符之间的匹配情况，若是匹配则为1，
 *否则为0。然后求出对角线最长的1序列，其对应的位置就是最长匹配子串的位置.
 *下面是字符串21232523311324和字符串312123223445的匹配矩阵，前者为X方向的，
 *后者为Y方向的。不难找到，红色部分是最长的匹配子串。通过查找位置我们得到最长的匹配子串为：21232
 *
 *但是在0和1的矩阵中找最长的1对角线序列又要花去一定的时间。通过改进矩阵的生成方式和设置标记变量，可以省去这部分时间。
 *
 *当字符匹配的时候，我们并不是简单的给相应元素赋上1，而是赋上其左上角元素的值加一。
 *我们用两个标记变量来标记矩阵中值最大的元素的位置，在矩阵生成的过程中来判断当前生成
 *的元素的值是不是最大的，据此来改变标记变量的值，那么到矩阵完成的时候，最长匹配子串的位置和长度就已经出来了。
 * @author charlie
 *
 */
class SolutionLS{
	public SolutionLS(String a, String b) {
		int[][] matrix = new int[a.length()+1][b.length()+1];
		int max_i=0, max_j=0, max=0;
		for(int i=1; i<=a.length(); i++)
			for(int j=1; j<=b.length(); j++) {
				if(a.charAt(i-1)==b.charAt(j-1))
				{	
					matrix[i][j] = matrix[i-1][j-1]+1;
					if(matrix[i][j]>max) {
						max = matrix[i][j];
						max_i = i;
						max_j = j;
					}
				}
				
			}
		System.out.println(max);
	}
	
}