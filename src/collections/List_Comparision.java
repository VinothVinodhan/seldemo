package collections;

import java.util.LinkedList;
import java.util.List;

public class List_Comparision {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		System.out.println(list1);

		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
		if(list1.equals(list2)){
			System.out.println("Both are equal");
		}
		else{
			System.out.println("Both are not equal");
		}
	}

}
