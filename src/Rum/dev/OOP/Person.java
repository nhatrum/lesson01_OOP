package Rum.dev.OOP;

public class Person {
	private String Name;
	private int Old;
	public Person(String Name, int Old ) {
		this.Name=Name;
		this.Old=Old;
	}
	public void Setten (String Name) {
		this.Name=Name;
	}
	public String getten() {
		return Name;
	}
	public int gettuoi() {
		return Old;
	}
	public void show() {
		System.out.println(Name+":"+Old);
	}
}
