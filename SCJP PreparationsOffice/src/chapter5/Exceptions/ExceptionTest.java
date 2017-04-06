package chapter5.Exceptions;

public class ExceptionTest {

	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4 };
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(a[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("IO");
		}catch(Exception ex){
			System.out.println("End");
		}
		int a1= 0;
		try{
			if(false){
				a1 = 1;
			}
			int b = 1/a1;
		}finally{
			System.out.println("hello");
		}

	}

}
