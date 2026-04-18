import java.util.*;
class Sample{
    public static void main(String args[]){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] merged = new int[arr1.length + arr2.length];
        for(int i = 0; i<arr1.length;i++){
            merged[i] = arr1[i];
        }
        for(int j = 0 ; j<arr2.length;j++){
            merged[arr1.length + j] = arr2[j];
        }
        for(int k = 0;k<merged.length;k++){
            System.out.print(merged[k]);
        }
    }
}