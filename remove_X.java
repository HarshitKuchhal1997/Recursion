package Recursion;
public class remove_X {
	public static String removeX(String s){
		if(s.equals(""))     // base condition for null string
			return "";
		
		if(s.charAt(0) == 'x')    // skip the 'x' character and recursive call on remaining string 
		{
			return(removeX(s.substring(1)));
		}
		else      // append the required character with the remaining string to be checked for 'x'
		{
			s = s.charAt(0)+removeX(s.substring(1));
			return s;
		}
	}
}
