package code;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class J8forEach {
	public static void main(String[] args) {  
		
/*		List<String> ll = Arrays.asList("Alex", "Brian", "Charles");	    
		ll.forEach(System.out::println);	*/

				 
/*		Consumer<String> UC = new Consumer<String>()
				{
				    @Override
				    public void accept(String t) 
				    {
				        System.out.println(t.toUpperCase());
				    }
				};		
		List<String> ll = Arrays.asList("Alex", "Brian", "Charles");
		ll.forEach(UC);  */ 
		
		
/*		Map<String, String> map = new HashMap<String, String>();		 
		map.put("A", "Alex");
		map.put("B", "Brian");
		map.put("C", "Charles");		 
		map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));*/
		
		
/*		BiConsumer<String, Integer> AC = (a, b) -> { 
													    System.out.println("Key is : " + a); 
													    System.out.println("Value is : " + b); 
													}; 
		 
		Map<String, Integer> map = new HashMap<>();		     
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);		 
		map.forEach(AC);*/
		
		
	     
/*		Consumer<Integer> action = System.out::println;
		List<Integer> ll = Arrays.asList(1,2,3,4,5);
		ll.stream()
		    .filter(n -> n%2  == 0)
		    .forEach( action );*/
		
		//Interview task
/*		Consumer<Integer> UC = new Consumer<Integer>()
		{
		    @Override
		    public void accept(Integer i) 
		    {
		        System.out.println(i*i);
		    }
		};	
		List<Integer> ll = Arrays.asList(1,2,3,4,5);
		ll.stream().forEach( UC );*/
		
		
	}
	

		
}

