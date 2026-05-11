abstract class One{
    void display(){
        System.out.println("I am One");
    }
}

class Sample extends One{
    
}

class Main{
    public static void main(String args[]){
        Sample sp = new Sample();
        sp.display();
    }
}

/* Abstract cant directly used in class main so so we have to extends in another class and and used in main class  */