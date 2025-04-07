import java.util.*;
import java.util.Arrays;
public class Slargest {
     public  int secondLargest(int[] arr,int n){
            int largest = arr[0];
            int Slargest = -1;
            for(int i =1 ;i<n;i++){
               if(arr[i] > largest){
                    Slargest = largest;
                    largest = arr[i];
               }
               else if(arr[i] < largest && arr[i] > Slargest){
                    Slargest = arr[i];
               }
              
            }
            return Slargest;
     }
     public static void main (String args[]){
          int[] arr = {1,2,6,4,3};
          Slargest obj = new Slargest();
          int n = arr.length;
          int result = obj.secondLargest(arr, n);
          System.out.println("The second largest element is: " +result);
  
          
     }
}
