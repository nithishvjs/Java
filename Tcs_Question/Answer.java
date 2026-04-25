import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 1; // first element always counted
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double avg = (double) sum / i;

            if (arr[i] > avg) {
                count++;
            }

            sum += arr[i];
        }
        System.out.println(count);
    }
}
