package zSumps.ocjpPreps;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class XMLMessage extends scjpTest.Message {
	public XMLMessage(String name) {

	}

	public XMLMessage() {
		this("");
		all(new int[] { 1, 2 });
	}

	String getText() {
		return "<msg>text</msg>";
	}

	static final int[] a;
	static {
		a = new int[2];
		a[0] = 100;
		a[1] = 200;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(new XMLMessage().getText());
		File dir = new File("dir");
		dir.mkdir();
		File f = new File(dir, "f");
		f.createNewFile();
		String csv = "Sue,5,true,3";
		Scanner scanner = new Scanner(csv);
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				int age = scanner.nextInt();
				System.out.println(age);
			}
		}
		//all(new int[] { 1, 3 });

	}

	static void all(int[] arr) {
		System.out.println("aaa");
	}

}