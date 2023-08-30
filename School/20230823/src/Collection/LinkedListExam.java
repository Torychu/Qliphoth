package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {
	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
	
	list.add("유재석");
	list.add("지석진");
	list.add("김종국");
	list.add("송지효");
	list.add("하하");
	
	System.out.println(list);
	
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	System.out.println(list.get(3));
	
	list.addFirst("서장훈");
	list.addLast("김희철");
	list.add(1, "김영철");
	System.out.println(list);
	
	list.removeFirst();
	list.removeLast();
	System.out.println(list);
	
	for (String string : list) {
		System.out.println(string);
	}
	
	System.out.println("++++++++++++++++++++");
	
	//변경
	list.set(0,  "이수근");
	System.out.println(list.get(0));
	
	System.out.println(list.indexOf("김종국"));
	if(list.contains("김종국"))
		System.out.println("김종국이 있습니다.");
	else
		System.out.println("김종국이 없습니다.");
	
	System.out.println("++++++++++++++++++++");
	
	list.clear();
	if(list.isEmpty())
		System.out.println("학생수:" + list.size());

	System.out.println("++++++++++++");
	
	list.add("유재석");
	list.add("지석진");
	list.add("김종국");
	list.add("송지효");
	list.add("하하");
	
	Collections.sort(list);
	for(String string : list) {
		System.out.println(string);
	}
	}
}
