
public class Call {
public static void main(String args[]){
	int i= 5;
	int j= 8;
	int k= max(i,j);
	System.out.println("The minimum values : " +i+ " and " +j+ " is :"+k );	
}


public static int max(int num,int numm){
	int result;
	
	if (num<numm){
		result=num;
	}
	else
	{
		result=numm;
	}
	return result;
}

}
