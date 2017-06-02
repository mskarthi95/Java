
/*Access modifier in this constructor, 
 * In constructor allows all type of access modifier
 * here the default class Obj used in Constructor  */


class Obj {

	int no;
	String name;
	
	Obj(int num, String nm){
		no=num;
		name=nm;
	}
	
	void display(){
		System.out.println(no+" "+ name);
	}
}

public class Parameter{
	public static void main(String args[]){
		
		Obj one = new Obj(1,"name");
		Obj two = new Obj(2,"name2");
		
		one.display();
		two.display();
	}
	
}

