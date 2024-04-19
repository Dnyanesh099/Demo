
public class Test 
{
  public static void main(String[] args) {
	  int arr[] = {66,43,67,88,91,22,76,78,10,33};
	  
	  int first=arr[0];
	  int second=arr[0];
	  int third=arr[0];
	  
	  for(int num:arr)
	  {
		  if(num>first)
		  {
			  third=second;
			  second=first;
			  first=num;
		  }
		  else if(num>second && num!=first)
		  {
			  third=second;
			  second=num;
		  }
		  else if(num>third && num!=first && num!=second)
		  {
			  third=num;
		  }
	  }
	  System.out.println(first+" "+second+" "+third);

  }
}
