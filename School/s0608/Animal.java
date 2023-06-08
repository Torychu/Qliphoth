package s0608;

public class Animal {
	Animal() {
		System.out.println("동물");
	}
}
class Dog extends Animal {
	Dog() {
		System.out.println("강아지 생성");
}

class Cat extends Animal {
	Cat() {
		System.out.println("고양이 생성");
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

