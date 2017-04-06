package chapter7.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Comparator_Test {

	
	public static void main(String args[]) {
		new Comparable_Comparator_Test().go();
	}

	void go() {
		ArrayList<DvdInfo> dvdInfos = populateData();
		System.out.println(dvdInfos);
		System.out.println("**************************COMPARABLE SORTED************************");
		Collections.sort(dvdInfos);
		System.out.println(dvdInfos);
		
		
		
		
		ComparatorTest comparatorTest = new ComparatorTest();
		Collections.sort(dvdInfos, comparatorTest);
		System.out.println("**************************COMPARATOR SORTED************************");
		System.out.println(dvdInfos);
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
