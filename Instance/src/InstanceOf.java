
public class InstanceOf {
}

class Child2 extends InstanceOf{}
class Child3 extends InstanceOf{}

	
class Test{
	public static void main(String args[]){
		
		InstanceOf I=new InstanceOf();
		Child2 C = new Child2();
		Child3 CC= new Child3();		
	
		System.out.println(I instanceof InstanceOf);
		System.out.println(CC instanceof InstanceOf);
		System.out.println(C instanceof InstanceOf);
		
		I=C;
		System.out.println(I instanceof Child2);
		I=CC;
		System.out.println(I instanceof Child3);

	}
}