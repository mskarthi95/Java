
class Bank {

	int ac;
	String name;
	static String branch = "kgisl";
	
	Bank(int ac,String name){
		this.ac=ac;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(ac+" "+name+" "+branch);
	}
}
	
class Static{
public static void main(String args[])
{
Bank ac1 = new Bank(10, "kg");
Bank ac2 = new Bank(20, "FSL");

ac1.display();
ac2.display();
	}
	
	
}
