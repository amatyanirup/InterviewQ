package interviewCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorCollection {

	public static void main(String[] args) {
		
		ArrayList<String>food=new ArrayList<String>();
		food.add("rice");
		food.add("daal");
		food.add("curry");
		food.add("chatani");
		food.add("greenchili");
		food.add("chickenmeatcurry");
		System.out.println(food.get(3));
		
		System.out.println("1**********// using advance loop");
		for(String meal:food) {
			System.out.println(meal);
		}
			
	System.out.println("2************** for-loop");
	// using for-loop
	for (int i = 0;i<food.size();i++) {
		System.out.println(food.get(i));
	}
	System.out.println("3************** java foreach loop with lamba run above jre 1.8");
	food.forEach(meal1->{
		System.out.println(meal1);
	});
	
	System.out.println("4************** using iterator");
	
	Iterator<String> it = food.iterator();
	while(it.hasNext()) {
		String meal2=it.next();
		System.out.println(meal2);
	}
	
	System.out.println("5************** for each remaining method");
	it=food.iterator();
	food.forEach(meal3->{
		System.out.println(meal3);
	});
	
	System.out.println("6************** list iterator");
	// we can use from both way from next- firstindex, previous-lastindex
	ListIterator<String> listit = food.listIterator(food.size());
	while(listit.hasPrevious()) {
		String meal4= listit.previous();
		System.out.println(meal4);
	}
	
	}

}
