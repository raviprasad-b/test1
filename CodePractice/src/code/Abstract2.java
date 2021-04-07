package code;

abstract class Phone{
	public abstract void showConfig();
}

class Iphone extends Phone{
	public void showConfig(){
		System.out.println("I phone");
	}
}

class Samsung extends Phone{
	public void showConfig(){
		System.out.println("Samsung");
	}
}

public class Abstract2 {
	public static void main(String[] args) {
		Iphone obj = new Iphone();
		Samsung obj1 = new Samsung();
		show(obj);
	}
	
	public static void show(Phone obj){
		obj.showConfig();
	}
	
}


/*
class Iphone{
	public void showConfig(){
		System.out.println("I phone");
	}
}

class Samsung{
	public void showConfig(){
		System.out.println("Samsung");
	}
}

public class Abstract2 {
	public static void main(String[] args) {
		Iphone obj = new Iphone();
		Samsung obj1 = new Samsung();
		show(obj1);
	}
	
	public static void show(Iphone obj){
		obj.showConfig();
	}
	
	public static void show(Samsung obj){
		obj.showConfig();
	}
}

*/