package code;

import java.util.ArrayList;
import java.util.Iterator;

import model.test1;

public class testing {
	public static void main(String[] args) {
			
	
	ArrayList<test1> al = new ArrayList<test1>();
	al.add(new test1(1,"ravi"));
	
	
	Iterator<test1> itr = al.iterator();
	while(itr.hasNext()){
		test1 s = itr.next();
		System.out.println(s.getId()+" "+s.getName());
	}
	
/*	for(test1 t : al){
		System.out.println(t.id+" "+t.name);
	}
	
	test1 t = al.get(0); 
	System.out.println(t.id+" "+t.name);*/
	
	
/*	test1 tt = new test1(1,"ravi");
	System.out.println(tt.getId());
	System.out.println(tt.id);
	tt.id=10;
	System.out.println(tt.id);*/
	
	
	}
	
}
