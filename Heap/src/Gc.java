
public class Gc {
public void finalize(){
	System.out.println("Finalise");
}
public static void main(String args[]){
	Gc s0= new Gc();
	s0=null;
	Gc s1= new Gc();
	s1=null;
	System.gc();
	
}
}
