import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a * b;
        int lcm = 0;
        int gcd = 1;
        for(int i = 2 ; i <= Math.min(a, b) ; i++){
            if(a%i == 0 && b%i == 0)
            gcd = i;
        }
        lcm = mul / gcd;
        System.out.println(lcm);
    }
}