package interviewCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Collection {

	public static void main(String[] args) {
	System.out.println("learing HashMAp***********");
	HashMap<Integer,String>Rollname = new HashMap<Integer,String>();
	Rollname.put(1,"Anshu");
	Rollname.put(2,"Babita");
	Rollname.put(3, "Chadani");
	Rollname.put(4, "Dristee");
	Rollname.put(5, "Emily");
	Rollname.put(6, "Fanny");
	Rollname.put(7, "Genila");
	Rollname.put(8, "Harsita");
	Rollname.put(9, "Indu");
	Rollname.put(10, "Janki");
	System.out.println(Rollname.get(5) );
	System.out.println(Rollname.containsValue("Fanny"));
	System.out.println(Rollname);
   Set<Map.Entry<Integer, String>> name= Rollname.entrySet();
  for( Map.Entry<Integer, String> fullname:name) {
	  System.out.println(fullname.getKey() +"   " + fullname.getValue());
  }
	System.out.println("*****two way fetch whole data from hashma*******");
	for (Entry name1:Rollname.entrySet()) {
		System.out.println(name1.getKey() + " "+ name1.getValue());
  }
	System.out.println("***************** Contructor class to fetch in Hashmap");
	HashMap<Integer,Employee>emp = new HashMap<Integer,Employee>();
	Employee e1= new Employee("Tom",45,"IT");
	Employee e2 = new Employee("Dam",50,"Admin");
	Employee e3 = new Employee("Sam",30,"Sale");
	
	emp.put(1, e1);
	emp.put(2, e2);
	emp.put(3, e3);
	
	for(Entry<Integer,Employee> em:emp.entrySet()) {
		int id = em.getKey();
		Employee e = em.getValue();
		System.out.println(id +"   " +e.name + "  "+e.age + "  "+e.dept);
	}
	}
	
	
	
	}


	
