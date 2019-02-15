package test;

class Dog {
	Dog(){
		System.out.println("Second Constructor");
	}
	protected void show() {
		System.out.println("Parent class");
	}
	
}

class Street_dog extends Dog {
	public String name;
	void get_name(String name) {
		this.name=name;
	}
	void print() {
		System.out.println(name);
	}
	Street_dog(){
		System.out.println("First constructor");
	}
	@Override
	public void show() {
		System.out.println("Child class");
	}

}

public class Animals {

	public static void main(String[] args) {
		Street_dog pet = new Street_dog();

		pet.show();
		
	}
}
