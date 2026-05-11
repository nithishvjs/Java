class Grandparent {
    void house() {
        System.out.println("Grandparent House");
    }
}

class Parent extends Grandparent {
    void car() {
        System.out.println("Parent Car");
    }
}

class Child extends Parent {
    void bike() {
        System.out.println("Child Bike");
    }
}

class Main {
    public static void main(String args[]) {
        Child c = new Child();
        c.house();
        c.car();
        c.bike();
    }
}
