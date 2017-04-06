package chapter7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest implements Comparator<DvdInfo> {

	public static void main(String args[]) {
		new ComparatorTest().go();
	}

	void go() {
		ArrayList<DvdInfo> dvdInfos = populateData();
		System.out.println(dvdInfos);
		ComparatorTest comparatorTest = new ComparatorTest();
		Collections.sort(dvdInfos);
		Collections.sort(dvdInfos, comparatorTest);
		System.out.println("**************************SORTED************************");
		System.out.println(dvdInfos);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(DvdInfo o1, DvdInfo o2) {
		return o1.getGenre().compareTo(o2.getGenre());
	}

	public static ArrayList<DvdInfo> populateData() {
		ArrayList<DvdInfo> dvdInfos = new ArrayList<DvdInfo>();
		DvdInfo dvdInfo1 = new DvdInfo("Donnie-Darko", "sci-fi", "Glynhake");
		DvdInfo dvdInfo2 = new DvdInfo("Raiders of the lost", "action", "Ford");
		DvdInfo dvdInfo3 = new DvdInfo("Caddy Shack", "comedy", "Murray, Bill");
		DvdInfo dvdInfo4 = new DvdInfo("Patriot Games", "action", "Ford");
		dvdInfos.add(dvdInfo1);
		dvdInfos.add(dvdInfo2);
		dvdInfos.add(dvdInfo3);
		dvdInfos.add(dvdInfo4);
		return dvdInfos;
	}

}
