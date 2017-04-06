package chapter6.numberFormats;

import java.text.NumberFormat;
import java.text.ParseException;

public class Format2 {
	public static void main(String args[]){
		float f1 = 123.45678f;
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits() + " ");
		System.out.println(nf.format(f1));
		
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(f1));
		
		try{
			System.out.println(nf.parseObject("1234.567"));
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parseObject("1234.567"));
		}catch (ParseException e) {
			System.out.println("Parse Exception");
		}
		
	}

}
