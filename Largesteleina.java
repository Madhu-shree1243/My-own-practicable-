import java.io.*;
import java.util.Arrays;
public class Largesteleina{
static private void getElements(int[] arr,int n){
     Arrays.sort(arr);
     int large = arr[n-1];
     System.out.println(" largest is " + large);

}
public static void main(String args[]){
     int[] arr = {1,2,6,4,3,9};
     int n = arr.length;
     getElements(arr, n);
}
}