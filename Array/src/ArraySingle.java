import java.util.Arrays;


public class ArraySingle {
public static void main (String args[]){
	
	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);	
	
	String[] array={"10","20","30"};
	
	System.out.println(Arrays.toString(array));
	
	System.out.println(Arrays.asList(array));
}
}
