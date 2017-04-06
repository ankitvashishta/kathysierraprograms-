package chapter5.conditions;

public class EnumSwitch {
	enum Color{RED, BLUE, GREEN}
	public static void main(String ... args){
		Color c = Color.GREEN;
		switch(c){
		case RED:
			System.out.println("red");
			break;
		case BLUE:
			System.out.println("blue");
			break;
		case GREEN:
			System.out.println("green");
			break;
		}
		
	}

}
