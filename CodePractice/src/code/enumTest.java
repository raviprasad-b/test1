package code;

enum Mobile{
	NOKIA,SONY
	}

class enumTest {	
	public static void main(String[] args) {
		
		Mobile mobile = Mobile.NOKIA;
		System.out.println(mobile);
		switch(mobile){
		case NOKIA:
			System.out.println("Nokia");
			break;
		case SONY:
			System.out.println("SONY");
			break;
		}
		
/*		for (Mobile myVar : Mobile.values()) {
		      System.out.println(myVar);
		    }*/
		
	
	}
}
