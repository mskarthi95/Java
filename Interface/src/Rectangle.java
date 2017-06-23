class Rectangle implements Draw{


	public void draw() {
		System.out.println("Draw a Rectangle");
		System.out.println("");
	}
	
	public static void main(String... args){
		Rectangle r=new Rectangle();
		Circle c= new Circle();
		
		r.draw();
		c.draw();
		
		
	}
}
