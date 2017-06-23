import java.util.*;

public class Dept {

	String name;
	List<Student> students;
	
	Dept(String name, List<Student> students){
		this.name=name;
		this.students=students;
		
	}
	public List<Student> get(){
		return students;
	}
}
