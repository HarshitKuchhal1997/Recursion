package Recursion;
public class merge_sort_code {
	public static void mergeSort(int[] input){
		
		callsort(input,0,input.length-1);
      
	}
  	public static void merge(int[]input,int s,int e){
    int m=(s+e)/2;
    int temp[]=new int[e-s+1];
    int s1=s;
    int s2=m+1;
    int i=s1;
    int j=s2;
    int p=0;
    while(i<=m&&j<=e){
      if(input[i]>input[j]){
        temp[p]=input[j];
        j++;
        p++;
        
      }
      else{
        temp[p]=input[i];
        i++;
        p++;
        
      }
    }
    while(i<=m){
      temp[p]=input[i];
        p++;
      i++;
    
    }
    while(j<=e){
      temp[p]=input[j];
      p++;
      j++;
    }
    for(int k=0; k<temp.length;k++){
      input[s+k]=temp[k];
      
    }
  }
  public static void callsort(int[]input,int s,int e){
    if(s>=e){
      return;
      
    }
    int m=(s+e)/2;
    callsort(input,s,m);
    callsort(input,m+1,e);
    merge(input,s,e);
    
  }
}
