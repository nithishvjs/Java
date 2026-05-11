import java.util.*;
class Sample{
    String name;
    int age;
    
    Sample(String n, int a){
        name = n;
        age = a;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Main{
    public static void main(String args[]){
        Sample obj = new Sample("Nithish", 21);
        obj.display();
    }
}
