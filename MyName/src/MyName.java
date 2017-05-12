
public class MyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My name is Hantong.");
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Animal();
		Animal[] animals = new Animal[3];
		animals[0] = a1;
		animals[1] = a2;
		animals[2] = a3;
		for (Animal a:animals) {
			a.makeSound();
		}
	}

}
