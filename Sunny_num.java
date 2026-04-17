import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n + 1;
        int root = (int)Math.sqrt(n1);
        if(root * root == n1)
        System.out.println("Sunny num");
        else
        System.out.println("Not sunny num");
    }
}