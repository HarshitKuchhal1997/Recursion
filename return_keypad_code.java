package Recursion;
public class return_keypad_code {
	// Return a string array that contains all the possible strings
    private static char[] helper(int n){
        if(n==2){
            char arr[] = {'a','b','c'};
            return arr;
        }else if(n==3){
            char arr[] = {'d','e','f'};
            return arr;
        }else if(n==4){
            char arr[] = {'g','h','i'};
            return arr;
        }else if(n==5){
            char arr[] = {'j','k','l'};
            return arr;
        }else if(n==6){
            char arr[] = {'m','n','o'};
            return arr;
        }else if(n==7){
            char arr[] = {'p','q','r','s'};
            return arr;
        }else if(n==8){
            char arr[] = {'t','u','v'};
            return arr;
        }else if(n==9){
            char arr[] = {'w','x','y','z'};
            return arr;
        }else{
            char arr[] = new char[0];
            return arr;
        }
        
    }
    
	public static String[] keypad(int n){
		if(n ==0){
            String ans[] = {""};
            return ans;
        }

        String smallAns[] = keypad(n/10);
        char arr[] = helper(n%10);
        String ans[] = new String[smallAns.length * arr.length];

        int k =0;
        for(int i =0;i<smallAns.length; i++){
            for(int j =0; j<arr.length;j++){
                ans[k] = smallAns[i] + arr[j];
                k++;
            }
        }
        return ans ;
        
        
	}
	
}
