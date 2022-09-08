package Class;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex8 {
	Ex2[] member;
	static List<Ex2> list;
	public Ex8() {
		member = new Ex2[3];
		member[0] = new Ex2("홍길동1", "a", "1");
		member[	0] = new Ex2("홍길동1", "a", "1");
		member[2] = new Ex2("홍길동3", "c", "3");
		list = Arrays.asList(member);
		for(Ex2 m :list) {
			System.out.println(m.getName());
		}
		list = new LinkedList<>(list);
		Iterator<Ex2> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().getName());
		}
		list.remove(member[1]);
		for(Ex2 m : list) {
			System.out.println(m.getName());
		}
	}
	
	public static void main(String args[]) {
		new Ex8();
	}
}
