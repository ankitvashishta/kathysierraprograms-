package zSumps.ocjpPreps;

import java.io.File;
import java.io.IOException;

public class TestTryCatch {

	// public static void main(String args[]){
	// TestTryCatch testTryCatch = new TestTryCatch();
	// try {
	// testTryCatch.tryFileOpen();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// public void tryFileOpen() throws IOException{
	//
	// File file=new File("testFile");
	// try {
	// file.createNewFile();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }
	static void test() throws Error {
		if (true)
			throw new AssertionError();
		System.out.print("test ");
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
		System.out.print("end ");
	}

}
