import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int j = 0; j < arr.length ; j++){
            if(arr[j] < min)
            min = arr[j];
        }
        System.out.print(min);
    }
}


