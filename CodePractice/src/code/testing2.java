package code;

public class testing2 {

	
	
	public static void main(String[] args) throws Exception {
		Class cls = Class.forName("java.lang.ClassLoader");
		Class test = (Class)cls.newInstance();
		System.out.println(test.getClass().getName());
	}

}
