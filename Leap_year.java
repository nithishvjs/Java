import java.util.*;
class Sample{
    static void num(int x){
        if(x%4==0 && x%100!=0 || x%400==0)
        System.out.println("Leap year");
        else
        System.out.println("Not a leap year");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        num(x);
    }
}