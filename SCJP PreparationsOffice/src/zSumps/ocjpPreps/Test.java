package zSumps.ocjpPreps;

public class Test {
	public enum Dogs {
		collie, harrier
	};

	public static void main(String[] args) {
		Dogs myDog = Dogs.collie;
		switch (myDog) {
		case collie:
			System.out.print("collie ");
		case harrier:
			System.out.print("harrier ");
		}

		String[] elements = { "for", "tea", "too" };
		String first = (elements.length > 0) ? elements[0] : null;
	}
}