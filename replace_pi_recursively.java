package Recursion;
public class replace_pi_recursively {
	public static String replace(String input){
		if (input.equals("") || input.length() < 2)
            return input;
	    if (input.charAt(0) == 'p' && input.charAt(1) == 'i')
            return "3.14" + replace(input.substring(2));
  		return input.charAt(0) + replace(input.substring(1));
	}
}
