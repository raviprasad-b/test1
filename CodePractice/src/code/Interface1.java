package code;

interface Abc{
	void show();
}

class AbcImpl implements Abc{
	 public void show(){
		 System.out.println("show");
	 }
}

public class Interface1 {
public static void main(String[] args) {
	Abc obj = new AbcImpl();
	obj.show();
}
}
