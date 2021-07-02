package Recursion;
public class All_indices_of_number {
	public static int[] allIndexes(int input[], int x) {
		
        return helper(input, x, 0);
		
	}
    public static int[] helper(int[] input, int x, int start) {
		
		int n = input.length;
		if(start ==n)//n elements
		{
			int ans[] = new int[0];
			return ans;
		}
		int[] smallIndex = helper(input, x, start + 1); 
		if(input[start] ==x)// if match found at 0th index
		{
			int[] myAns = new int[smallIndex.length +1];
			myAns[0] = start;
			for(int i=0;i<smallIndex.length;i++)
			{
				myAns[i+1] = smallIndex[i];
			}
			return myAns;
		}
		else
			return smallIndex;
	}	
}
