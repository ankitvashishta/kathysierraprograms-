package chapter6.stringHandling;

import java.io.File;

public class CheckingDirs {

	public static void main(String args[]) {
		String[] files = new String[100];
		File search = new File("D:\\My stuff\\checkingDirs");
		files = search.list();
		for (String fn : files) {
			System.out.println("found" + fn);
			checkDir(fn, search);
		}
	}
	
	public static void checkDir(String fn, File search){
		
		File newFile = new File(search + File.separator + fn);
		if(newFile.isDirectory()){
			String files1[] = new String[100];
			System.out.println("***********Files************");
			files1 = newFile.list();
			for (String fn1 : files1) {
				System.out.println("found" + fn1);
				checkDir(fn1, newFile);
			}
		}
	}

}
