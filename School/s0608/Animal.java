package s0608;

public class Animal {
	Animal() {
		System.out.println("����");
	}
}
class Dog extends Animal {
	Dog() {
		System.out.println("������ ����");
}

class Cat extends Animal {
	Cat() {
		System.out.println("������ ����");
	}
	
class AnimalMain{
	public void main(String[] args) {
		System.out.println("Animal Main");
		
		Dog d = new Dog();
		Animal a = new Dog();
		Animal b = new Cat();
		Dog c = (Dog)new Animal();
	}
}
