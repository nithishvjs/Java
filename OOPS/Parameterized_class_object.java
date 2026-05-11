class Sample {
    String name;
    String dept;
    int year;
    String clg;

    Sample(String n, String d, int y, String c){
      name = n;
      dept = d;
      year = y;
      clg = c;
    }
  
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Year: " + year);
        System.out.println("College: " + clg);  
    }
}

public class Main {
    public static void main(String args[]) {
        Sample obj1 = new Sample("Dharun", "IOT", 4, "NANDHA ENGINEERING COLLEGE");
        obj1.display();  // This is Method Call
    }
}
    
