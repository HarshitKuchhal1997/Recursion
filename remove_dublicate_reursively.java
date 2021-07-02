package Recursion;
public class remove_dublicate_reursively {
	public static String removeConsecutiveDuplicates(String input) {
		if(input.length()==0 || input.length()==1)
            return input;
        if(input.charAt(0)==input.charAt(1))
            input=removeConsecutiveDuplicates(input.substring(1));
        else
            input= input.substring(0,1)+removeConsecutiveDuplicates(input.substring(1));
        return input;
    }

}