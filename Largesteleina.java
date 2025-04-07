import java.io.*;
import java.util.Arrays;
public class Largesteleina{
static private void getLargest(int[] arr,int n){
//      Arrays.sort(arr);
//      int large = arr[n-1];
//      System.out.println(" largest is " + large);

// }
// public static void main(String args[]){ ---------------->>>>> brute force
//      int[] arr = {1,2,6,4,3,9};
//      int n = arr.length;
//      getElements(arr, n);
// }

//-------------------------Optimal Solution------------------------------
  int largest = arr[0];
 for(int i=1;i<n;i++){
     if(arr[i]>largest){
          largest = arr[i];
     }
 }
 System.out.println("largest is " + largest);
 
}
public static void main(String args[]){ 
     int[] arr = {1,2,6,4,3,9};
     int n = arr.length;
     getLargest(arr, n);
     
}
}