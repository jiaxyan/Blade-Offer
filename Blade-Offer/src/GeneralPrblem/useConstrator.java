package GeneralPrblem;

import java.util.Vector;

public class useConstrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp.initial();
//		Temp[] A = new Temp[5];
		for(int i = 0; i < 5; i++) {
			Temp t = new Temp();
		}
//		Temp t = new Temp();
//		Vector<Temp> B = new Vector<Temp>();
		System.out.println(Temp.getNum());
	}

}

class Temp{
	private static int Sum = 0;
	private static int N = 0;
	
	
	public Temp() {
		
		N++;
		Sum += N;
		System.out.println("N:"+N+"  Sum:"+Sum);
	}
	
	public static void initial() {
		Sum = 0;
		N = 0;
	}
	
	public static int getNum() {
		return Sum;
	}
	
}