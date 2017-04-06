import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex1{
	
	public static void main(String args[]){
		String s="∑";
		Pattern pat = Pattern.compile("([^A-Za-z0-9_!,\"#\\$%\\&'*|;:\\+\\-\\./:;<\\=>\\?@\\[\\]\\u0374-\\u03f3\\^_`\\{|\\}\\u0100-\\u017f~\\(\\)\\u0080-\\u00ff])");
		Matcher match = pat.matcher(s);
		if(match.find()){
			System.out.println(match.group());
		}
		try{
			throw new NullPointerException();
		}catch(NullPointerException e){
			e.printStackTrace();
			//throw e;
		}
		
	}
}
