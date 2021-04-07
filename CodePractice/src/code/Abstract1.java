package code;



abstract class MaheshPhone{
	public void call(){
		System.out.println("calling");
	}
	abstract public void move();
	abstract public void dance();
	abstract public void cook();
}

abstract class RameshPhone extends MaheshPhone{
	public void move(){		
		System.out.println("moving");		
	}	
}

class SureshPhone extends RameshPhone{
	public void dance(){		
		System.out.println("dancing");		
	}
	public void cook(){
		System.out.println("cooking");		
	}
}

public class Abstract1 {
	public static void main(String[] args) {		
		MaheshPhone obj = new SureshPhone();
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
		
	}
}
