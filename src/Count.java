import java.util.HashMap;

public class Count
{
  public static void main(String[] args) {
	
	  String str = "This this is is done by Saket Saket";
	  
	  String words[]=str.split(" ");
	  
	  HashMap<String, Integer> count=new HashMap<String, Integer>();
	  
	  for(String s:words)
	  {
		  String Lowerword=s.toLowerCase();
		  if(count.containsKey(Lowerword))
		  {
			  count.put(Lowerword, count.get(Lowerword)+1);
		  }
		  else
		  {
			  count.put(Lowerword,1);
		  }
	  }
	  System.out.println("Words Count---");
	  
	  for(String s1:count.keySet())
	  {
		  System.out.println(s1+" "+count.get(s1));
	  }
 }
}
