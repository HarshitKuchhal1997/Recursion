package Recursion;
public class count_zeros {
	public static int countZerosRec(int input){
		// Write your code here
        int c=0,r;
        while(input!=0){
            r=input%10;
            if(r==0)
                ++c;
            input/=10;
        }
        return c;
	}
}

