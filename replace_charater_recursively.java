package Recursion;
public class replace_charater_recursively {
	public static String replaceCharacter(String input, char c1, char c2) {
		
        if (input.length() < 1)
        	return input;
    	if (input.charAt(0) == c1)
        	input = c2 + input.substring(1);
    	//System.out.println(s);
		return input.charAt(0) + replaceCharacter(input.substring(1, input.length()), c1, c2);

	}
}
