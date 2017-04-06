package chapter7.wildcards;

public class TestGenerics<T> {

	T anInstance;
	T[] anArrayOfTs;

	TestGenerics(T anInstance) {
		this.anInstance = anInstance;
	}

	T getT() {
		return anInstance;
	}

}
