class Test implements Print {

	 public void print(){
		System.out.println("TESTED");
	}
	
	public static void main(String args[]){
		Test obj=new Test();
		
		obj.print();
	}
}
