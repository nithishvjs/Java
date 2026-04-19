import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        for(int i = s ; i <= e ; i++){
            int sum = 0;

            for(int j = 2 ; j < i ; j++){
                if(i % j == 0)
                    sum++;
            }

            if(i > 1 && sum < 1)
                System.out.print(i + " ");
        }
    }
}