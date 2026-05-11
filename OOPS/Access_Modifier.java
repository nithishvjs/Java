import java.util.*;
class Sample{
    private String name;
    private int age;
    
    Sample(String n, int a){
        name = n;
        age = a;
    }
    
    public String getName(){
        return name;
    }
    
    public int getage(){
        return age;
    }    
    
}

class Main{
    public static void main(String args[]){
        Sample obj = new Sample("Nithish",21);
        System.out.println(obj.getName());
        System.out.println(obj.getage());
    }
}

//One constructor can return only one value so we use two constructors
