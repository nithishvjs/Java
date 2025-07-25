import java.util.*;
class Sample{
    static void num(int x){
        int c=0;
        int temp=0;
        int p=1;
        int m=x;
        while(x>0){
            c++;
            x=x/10;
        }
        for(int i=1;i<c;i++){
            p=p*10;
        }
        while(m>0){
            temp=m%p;
            m=m/10;
            p=p/10;
        }
        System.out.println(temp);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        num(x);
    }
}