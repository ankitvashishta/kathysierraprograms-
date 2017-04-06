package chapter2.thingsToDo;

public class CheckInterface implements SuperInterface, SubInterface{

	@Override
	public void call() {
		System.out.println("Hello");
		
	}

}


interface SuperInterface{
	public void call(); 
}

interface SubInterface extends SuperInterface{
	public void call();
}