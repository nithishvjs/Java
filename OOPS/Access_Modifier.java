import java.util.*;
class Sample{
    private int rollno;
    private int age;
    
    Sample(int n, int a){
        rollno = n;
        age = a;
    }
    
    public int getRollno(){
        return rollno;
    }
    
    public int getage(){
        return age;
    }    
    
}

class Main{
    public static void main(String args[]){
        Sample obj = new Sample(10,21);
        System.out.println(obj.getRollno());
        System.out.println(obj.getage());
    }
}
