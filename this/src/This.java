
 class Student {
int ac;
String name;
float fees;

Student(int ac,String name,float fees){
this.ac=ac;
this.name=name;
this.fees=fees;	
}

void display(){
	System.out.println(ac+" "+name+" "+ fees );
}
}

class This{
	public static void main(String args[]){
		
		Student s1 = new Student(10,"KG",100);
		Student s2 = new Student(20,"KGFSL",101);

		s1.display();
		s2.display();
	}

}
