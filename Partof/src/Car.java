
public class Car {

	final Engine engine;
	
	Car(Engine engine){
		this.engine=engine;
	}
	
	public void move(){
		
		engine.work();
		System.out.println("Moving");
	}
}
