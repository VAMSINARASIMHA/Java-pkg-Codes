package constructor;

class Employee {

    int id;
    String name;

    // Constructor 1
    Employee() {
        id = 0;
        name = "Unknown";
    }

    // Constructor 2
    Employee(int i) {
        id = i;
        name = "Unknown";
    }

    // Constructor 3
    Employee(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Employee s1 = new Employee();
        Employee s2 = new Employee(101);
        Employee s3 = new Employee(102, "Vamsi");

        s1.display();
        s2.display();
        s3.display();
    }
}
