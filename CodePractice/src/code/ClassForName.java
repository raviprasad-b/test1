package code;

public class ClassForName {
	   public static void main(String[] args) {

		      try {
		    	  
		         Class<?> cls = Class.forName("java.lang.ClassLoader");

		         ClassLoader cLoader = cls.getClassLoader();		       

		         Class<?> cls2 = Class.forName("java.lang.Thread", true, cLoader);       
		          
		         System.out.println("Name of Class  = " + cls2.getName());//get the name of class  
		         System.out.println("Package Name  = " + cls2.getPackage());//get the package         System.out.println("Interface Name  = " + classlldr.getInterfaces());//get the Interface  
		         System.out.println("Construcors     = " + cls2.getConstructors());//get the constructor   
		         System.out.println("Classes        = " + cls2.getClasses());//get the class  
		         
		      } catch(ClassNotFoundException ex) {
		         System.out.println(ex.toString());
		      }
		   }
}
