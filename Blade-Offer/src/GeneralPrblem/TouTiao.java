package GeneralPrblem;

import java.util.Stack;

public class TouTiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNum(522332);
	}

	public static void PrintNum(int num) {
		int count = 0, tempNum = num;
		Stack s = new Stack();
		int[] numSotre = new int[100];
		while(tempNum>0) {
			s.push(tempNum%10);
			tempNum = tempNum/10;
			count++;
		}
		for(int t=0; t<count; t++)
			numSotre[t] = (int)s.pop();
		
		int space = count*5+(count-1)*2;
		//第一行
		for(int col=0; col<count; col++) {
			switch(numSotre[col]){
			case 1:
				System.out.print("....*");
				break;
			case 4:
				System.out.print("*...*");
				break;
			default:
				System.out.print("*****");
			}
			if(col<(count-1))
				System.out.print("..");
		}
		System.out.println();
		//第二行
		for(int col=0; col<count; col++) {
			switch(numSotre[col]){
			case 9:
			case 8:
			case 4:
			case 0:
				System.out.print("*...*");
				break;
			case 2:
			case 3:
			case 7:
			case 1:
				System.out.print("....*");
				break;
			case 5:
			case 6:
				System.out.print("*....");
				break;
			}
			if(col<(count-1))
				System.out.print("..");
		}
		System.out.println();
		//第三行
		for(int col=0; col<count; col++) {
			switch(numSotre[col]){
			case 7:
			case 1:
				System.out.print("....*");
				break;
			case 0:
				System.out.print("*...*");
				break;
			default:
				System.out.print("*****");
			}
			if(col<(count-1))
				System.out.print("..");
		}
		System.out.println();
		//第四行
		for(int col=0; col<count; col++) {
			switch(numSotre[col]){
			case 3:
			case 4:
			case 5:
			case 7:
			case 9:
			case 1:
				System.out.print("....*");
				break;
			case 2:
				System.out.print("*....");
				break;
			case 0:
			case 6:
			case 8:
				System.out.print("*...*");
				break;
			}
			if(col<(count-1))
				System.out.print("..");
		}
		System.out.println();
		//第五行
		for(int col=0; col<count; col++) {
			switch(numSotre[col]){
			case 1:
			case 4:
			case 7:
				System.out.print("....*");
				break;
			default:
				System.out.print("*****");
			}
			if(col<(count-1))
				System.out.print("..");
		}
	}
}
