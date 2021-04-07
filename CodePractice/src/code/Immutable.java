package code;

public class Immutable {
    public static void main(String args[]){
    	
    	System.out.println("-----String------"); //immutable
        String s="Sachin";
        s.concat(" Tendulkar");// the object of the immutable class cannot be changed
        System.out.println(s); //Sachin
        s = s.concat("Tendulkar"); // the copy of the object can be changed
        System.out.println(s); //SachinTendulkar
                

        System.out.println("-----String buffer------"); //mutable
        StringBuffer s2 =new StringBuffer("Sachin");
        s2.append("Tendulkar");
        System.out.println(s2); //SachinTendulkar

      } 
}
