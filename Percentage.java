import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter no of sub: ");
        int sub = sc.nextInt();
        double s = sub * 100;
        for(int i = 0 ; i < sub ; i++){
            System.out.println("Enter sub: ");
            double k = sc.nextDouble();
            sum = sum + k;
        }
        double p = (sum / s) * 100;
        System.out.println(p + "%");
    }
}