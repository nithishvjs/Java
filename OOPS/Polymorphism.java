class Sample{
    void display(){
        System.out.println("Empty");
    }
    
    int display(int a, int b){
        return a + b;
    }
}

class Main{
    public static void main(String args[]){
        Sample sp = new Sample();
        sp.display();
        System.out.println(sp.display(10,15));
    }
}

//Polymorphism(many forms) is used for we can use a single function name multiple times with different signature(types)