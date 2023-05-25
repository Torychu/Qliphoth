package s0525;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.name = "±Ë∑Œ∫ø";
		kim.grade = 1;
		
		Student lee = new Student("¿Ã∑Œ∫ø");
		lee.grade = 2;
		
		//
		
		Student jung = new Student("¡§∑Œ∫ø",1);
//		System.out.println(jung.name);
//		System.out.println(jung.grade);
		kim.print();
		lee.print();
		jung.print();
	}

}
