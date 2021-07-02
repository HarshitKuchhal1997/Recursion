package Recursion;
public class check_palindrome_recursively {
	public static boolean isStringPalindrome(String input) {
		
        int n=input.length();
        
        if(n==0 || n==1)
            return true;
        return calc(input,0,n-1);
	}
    
    static boolean calc(String input,int start,int end){
        if(start==end)
            return true;
        
        if((input.charAt(start))!=(input.charAt(end)))
            return false;
        
        if(start<end+1)
            return calc(input,start+1,end-1);
        return true;
    }
}
