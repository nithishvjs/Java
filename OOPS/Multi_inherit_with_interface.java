interface One{
    abstract int display(int a, int b);
}

interface Two{
    abstract int disp(int a, int b);
}

class Sample implements One, Two{
    public int display(int a, int b){
        return a + b;
    }
    
    public int disp(int a, int b){
        return a * b;
    }
}

class Main{
    public static void main(String args[]){
        Sample s = new Sample();
        System.out.println(s.display(10,15));
        System.out.println(s.disp(5,4));
    }
}
