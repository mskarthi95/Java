
//Call by value 

public class Value {
public void  V(int x,byte y){
x=10;
y=20;
}

	public static void main(String args[])
	{
		int x=50;
		byte y=10;
		Value C= new Value();
	C.V(x,y);
	
System.out.println(y);
System.out.println(x);
}
	
}
