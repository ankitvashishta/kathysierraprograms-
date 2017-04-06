package zSumps.ocjpPreps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

public class NumberNames {

	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	public void put(String name, int value) {
		map.put(name, value);
	}

	public Set<String> getNames() {
		return map.keySet();
	}

	public static void main(String args[]) throws IOException {
		NumberNames nm = new NumberNames();
		nm.put("One", 1);
		System.out.println(nm.getNames());

		new BufferedReader(new FileReader("in"));

		new PrintWriter(new BufferedWriter(new FileWriter("out")));
	}

	enum Element {
		EARTH, WIND, FIRE {
			public String info() {
				return "HOT";
			}
		};

		public String info() {
			return "Element";
		}
	}

	public static boolean doesFileExist(String[] directories, String fileName) {
		String path = "";
		for (String dir : directories) {
			path = path + File.separator + dir;
		}
		
		File file = new File(path, fileName);
		
		return file.exists();
	}

}
