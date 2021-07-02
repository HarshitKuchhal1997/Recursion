package Recursion;
public class quick_sort_code {
	public static void quickSort(int[] input) {
		 quickSort(input, 0, input.length-1);
	}
    
    static void quickSort(int input[], int SI, int EI){
        if(SI >= EI)
            return ;
        
        int pivotPos = partition(input, SI, EI);
            quickSort(input, SI, pivotPos-1);
            quickSort(input, pivotPos+1, EI);
        
    }
        
     static int partition(int a[], int SI, int EI){
         int pivot = a[SI];
         int count = search(a,SI, EI, pivot);
         int pivotPos = SI+count;
         int temp = a[SI];
         a[SI] = a[pivotPos];
         a[pivotPos] = temp;
         
         int i=SI;
         int j= EI;
         while(i<pivotPos && j>pivotPos){
             if(a[i]<=pivot)
                 i++;
             else if(a[j]>pivot)
                 j--;
             else{
                 int t = a[i];
                 a[i]=a[j];
                 a[j]=t;
                 i++;j--;
             }
         }
         return pivotPos;
         
     }   
        
        static int search(int a[], int SI, int EI, int key){
            int c=0;
            for(int i=SI+1;i<=EI;i++){
                if(key>=a[i])
                    c++;
            }
            return c;
        }
    
        
    }
