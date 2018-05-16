package GeneralPrblem;

public class Sort {
	public static void main(String[] args) {
		int[] input = {45,23,6,634,1,323,4,564,23,89,21};
//		System.out.println(input[10]);
//		System.exit(0);
		QuickSort qs = new QuickSort();
		qs.sort(input, 0, input.length-1);
		System.out.println("fnial:::::");
		for (int i : input) {
			System.out.print(i+" ");
		}
	}
}

class QuickSort{
	public void sort(int[] input, int low, int high) {
		
		int i = low, j = high;
//		System.out.println("i="+i+"  j="+j);
		int temp = input[i];
//		System.out.println("temp:"+temp);
		while(i<j) {
			while(input[j]>=temp && i<j)
				j--;
			if(i<j)
				input[i++] = input[j];
			
			while(input[i]<=temp && i<j)
				i++;
			if(i<j)
				input[j--] = input[i];
		}
		input[i] = temp;
		
		for (int m : input) {
			System.out.print(m+" ");
		}System.out.println();
		if(i-1>low)
			sort(input, low, i-1);
		if(j+1<high)
			sort(input, j+1, high);
	}
}
