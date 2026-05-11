class Sample{
    final String name = "Nithish";
    final int age = 10;
    
    //name = "akash";
    //age = 15;
    
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Main{
    public static void main(String args[]){
        Sample sp = new Sample();
        sp.display();
    }
}
