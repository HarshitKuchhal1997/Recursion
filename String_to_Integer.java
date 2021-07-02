package Recursion;
public class String_to_Integer {
	public static int convertStringToInt(String input){
        
        return calc(input);
	}
    
    public static int calc(String input){
        int num=Integer.parseInt(input);
        return num;
    }
}
