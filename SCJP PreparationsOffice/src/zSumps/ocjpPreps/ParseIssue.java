package zSumps.ocjpPreps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ParseIssue {

	public static void parse(String str) {
		// try {
		// float f = Float.parseFloat(str);
		// } catch (NumberFormatException nfe) {
		// f = 0;
		// } finally {
		// System.out.println(f);
		// }
	}

	public static void main(String[] args) {
		String[] colors = { "blue", "red", "green", "yellow", "orange", "aga" };
		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "violet");
		System.out.println(s2 + " " + s3);

		HashMap props = new HashMap();
		props.put("key45", "some value");
		props.put("key12", "some other value");
		props.put("key39", "yet another value");
		Set s = props.keySet();
		s = new TreeSet(s);
		System.out.println(s);
		// parse("invalid");
	}

}
