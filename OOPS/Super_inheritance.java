class Person {
    String name = "Nithish";
}

class Student extends Person {
    String name = "Akash";
    void display() {
        System.out.println(name);
        System.out.println(super.name);
    }
}

class Main {
    public static void main(String args[]) {
        Student s = new Student();
        s.display();
    }
}

//Super means it can take name from parent class
//output: Akash
//        Nithish
