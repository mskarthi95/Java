
public class Operation {

	public static void main(String [] args){
		
		
		//Declare the Datatype
	
		
		
		int a=5;
		byte b= 1;
		short c=2;
		long d= 25;
		
		//Character
		 char e= 'a';
		
		//double and float
		float f= 10.2f;
		double g= 10.2f;
		
		//boolean
		Boolean H= true;

		//Array Concept declaration
		
		int arr[]= new int[5];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		
		//Array direct declaration
		int arr1[]= {30,20,10,1};
		
		
		System.out.println("The value of Datatype");
	//	System.out.println("The value of Integer");
		
		System.out.println("Int :" + a);
		System.out.println("byte :" + b);
		System.out.println("Short :" + c);
		System.out.println("long :" +d);
		
		System.out.println("Char :" + e);
		System.out.println("Float :" + f);
		System.out.println("double :" + g);
		
		System.out.println("Boolean :" + H);
		
		
		/* Array concept with sequence */
		
		System.out.println("Array Value of index 0 :"+ arr[0]);
		System.out.println("Array Value of index 1 :"+ arr[1]);
		System.out.println("Array Value of index 2 :"+ arr[2]);
		System.out.println("Array Value of index 3 :"+ arr[3]);
		System.out.println("Array Value of index 0 :"+ arr[4]);
		
		
		//Print the Array value
		//for loop for printing array value
		
				for(int i=0;i<arr.length;i++)
					
		System.out.print(" "+ arr[i]);
				
				System.out.println(" ");
				System.out.println(" "+ arr[1]);
				
			
	}
	
}
