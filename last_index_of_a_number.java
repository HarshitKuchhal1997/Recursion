package Recursion;
public class last_index_of_a_number {
	public static int lastIndex(int input[], int x) {
        int a=input.length-1;
        return calc(input,x,a);
    }
    
    public static int calc(int input[],int x,int s){
        
        if(s==input[0]){
            return -1;
        }
        
        if(input[s]==x){
            return s; 
        }
        
        return calc(input,x,s-1);
        
	}	
}
