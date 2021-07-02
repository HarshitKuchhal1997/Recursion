package Recursion;
public class check_number_in_array {
	public static boolean checkNumber(int input[], int x) {        
		return check(input,x,0);
	}
    
    public static boolean check(int input[],int x,int start){
        if(start==input.length)
            return false;
        if(input[start]==x)
            return true;
        return check(input,x,start+1);
    }
    
}
