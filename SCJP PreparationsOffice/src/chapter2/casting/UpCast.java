package chapter2.casting;

public class UpCast {
	public static void main(String args[]){
		
		int[] arr = new int[3];
		char a = 97;
		arr[0] = a;
		System.out.println("char : " + arr[0] + a);
		Integer i1 = 2;
		Integer i2 = 2;
		Integer i3 = 128;
		Integer i4 = 128;
		if(i1==i2){
			System.out.println("i1 == i2");
		}
		if(i3==i4){
			System.out.println("i3 == i4");
		}
		
		Horse horse = new Horse();
		Animal1 animal1 = horse;
		Animal1 animal12 = (Animal1) horse;
	}

}


class Animal1{
	interface Ankit{
		
	}
}

class Horse extends Animal1{
	
}
interface Dj{
	class DJS{
		
	}
}