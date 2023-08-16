package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컬렉션 생성
		ArrayList<String> list = new ArrayList<>();
		
		//데이터 추가
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		//데이터 조회
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		//데이터 삭제
		System.out.println("삭제 전 신청 학생 수:" + list.size());
		list.remove("김종국");
		System.out.println("삭제 후 신청 학생 수:" + list.size());
		System.out.println(list.get(2));
		
		//순회
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println(list);
		
		//데이터 변경
		System.out.println("이름 변경 전:"+list.get(0));
		list.set(0, "이수근");
		System.out.println("이름 변경 후:"+list.get(0));
		
		//데이터 조회
		System.out.println(list.indexOf("송지효"));
		if(list.contains("송지효")) {
			System.out.println("송지효가 포함됨");
		}
		else {System.out.println("포함되지 않음");}
		
		//데이터 전체삭제
//		list.clear();
//		if(list.isEmpty());
//		}
	
		//데이터 재입력, 정렬
		list.add("이정현");
		list.add("이정현");
		list.add("이정현");
		list.add("이정현");
		list.add("이정현");
		list.add("윤재국 ");
		
		Collections.sort(list);
		for(String string:list) {
			System.out.println(string);
		}
		
		System.out.println(list);
	}
}
