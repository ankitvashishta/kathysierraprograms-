package chapter4.test;

public class Comp2 {
	public static void main(String args[]) {
		float f1 = 2.3f;
		float[][] f2 = { { 42.0f }, { 1.7f, 2.3f }, { 2.6f, 2.7f } };
		float[] f3 = { 2.7f };
		Long x = 42L;
		//
		if(x == f2[0][0]){
			System.out.println(true);
		}
		//System.out.println(f2[1][1]);

	}

}
/*
 * if(f1==f2)			
 * if(f1 == f2[2][1])	
 * if(x == f2[0][0])	
 * if(f1 == f2[1, 1])	
 * if(f3 == f2[2])		
 */