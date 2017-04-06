package chapter6.stringHandling;

import java.util.Scanner;

public class ScanIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input : ");
		System.out.flush();
		try{
			Scanner s = new Scanner(System.in);
			String token;
			do{
				token = s.findInLine(args[0]);
				System.out.println("found : "+token);
			}while(token!=null);
		}catch(Exception e){
			System.out.println("scan exception");
		}

	}

}
