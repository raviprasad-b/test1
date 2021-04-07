package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class J8stream {
	public static void main(String[] args)
    {
		
		
/*        Stream<Integer> st = Stream.of(1,2,3,4,5);
        st.forEach(p -> System.out.println(p));*/
        
        
        
/*        Stream<Integer> st = Stream.of( new Integer[]{1,2,3,4,5} );
        st.forEach(p -> System.out.println(p));*/
		
		
/*		 List<Integer> al = new ArrayList<Integer>();
		 
         for(int i = 1; i<= 5; i++){
             al.add(i);
         }
 
         Stream<Integer> st = al.stream();
         st.forEach(p -> System.out.println(p));*/
		
		
/*		Stream<Integer> st = Stream.generate(() -> (new Random()).nextInt(100000000));	 
	    st.limit(6).forEach(System.out::println);*/
         
         
/*		IntStream st = "dgdf".chars();
        st.forEach(p -> System.out.println(p));*/
         
		
/*		 List<Integer> list = new ArrayList<Integer>();		 
	         for(int i = 1; i< 10; i++){
	             list.add(i);
	         } 
         Stream<Integer> st = list.stream();
         List<Integer> evenNoList = st.filter(i -> i%2 == 0).collect(Collectors.toList());
         System.out.print(evenNoList);*/
		
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
/*		memberNames.stream().filter((s) -> s.startsWith("A"))
        .forEach(System.out::println);
		
		Amitabh
		Aman*/
		
/*		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println); 
		
		AMITABH
		AMAN*/
		
/*		memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		AMITABH
		LOKESH
		RAHUL
		SALMAN
		SHAHRUKH
		SHEKHAR
		YANA*/
		
/*		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
		
		[AMAN, AMITABH, LOKESH, RAHUL, SALMAN, SHAHRUKH, SHEKHAR, YANA]*/
		
		
/*		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("A"));		 
		System.out.println(matchedResult);
		 
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("A"));		 
		System.out.println(matchedResult);
		 
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("A"));		 
		System.out.println(matchedResult);
		
		true
		false
		false*/
		
		
/*		long totalMatched = memberNames.stream()
			    .filter((s) -> s.startsWith("A"))
			    .count();
			 
		System.out.println(totalMatched);
		
		2*/
		
/*		String firstMatchedName = memberNames.stream()
	            .filter((s) -> s.startsWith("L"))
	            .findFirst()
	            .get();
	 
		System.out.println(firstMatchedName);
		
		Lokesh*/
		
		
/*		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	  
		List<Integer> listWithoutDuplicates = al.stream()
	            .distinct()
	            .collect(Collectors.toList());
	  
		System.out.println(listWithoutDuplicates);
		
		[1, 2, 3, 4, 5, 6, 7, 8]*/
		
		
	  
/*		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4));
		Map<Integer, Long> counts =	al.stream().
				collect(Collectors.groupingBy	(e -> e, Collectors.counting())		);
		System.out.println(counts);
		     
		
			{1=2, 2=1, 3=3, 4=1}*/
		

/*		Map<String, Integer> map = new HashMap<String, Integer>();		 
		map.put("Ravi", 18000);
		map.put("Siddu", 22000);
		map.put("Sanjay", 30000);
		map.put("Dee", 11000);
	    
	    Map<String, Integer> result2 = new LinkedHashMap<>();
	    		  map.entrySet().stream()
                 .sorted(Map.Entry.comparingByValue())
                 .filter(mm -> mm.getValue().intValue() <= 22000)
                 .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
	    		 
	    System.out.println(result2);*/
        
	    
    }
}
