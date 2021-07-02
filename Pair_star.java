package Recursion;
public class Pair_star {
	// Return the updated string
	public static String addStars(String str) {
		if(str.length() < 2)
            return str;
		if(str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + addStars(str.substring(1));
		return str.charAt(0) + addStars(str.substring(1));
	}
}
