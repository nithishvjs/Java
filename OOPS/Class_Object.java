class Sample {
    String name;
    String dept;
    int year;
    String clg;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Year: " + year);
        System.out.println("College: " + clg);  
    }
}

public class classObject {
    public static void main(String args[]) {
        Sample obj1 = new Sample();

        obj1.name = "Dharun";
        obj1.dept = "IoT";
        obj1.year = 4;           
        obj1.clg = "NANDHA ENGINEERING COLLEGE";
        obj1.display();  
    }
}
    
