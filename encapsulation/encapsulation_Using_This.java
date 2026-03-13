package encapsulation;

class encap1 {
    private int age;
    private String name;

    public int getAge() {  //here we can use not only getAge() but also instead of getAge() or setAge() we can use any method name like abc() or xyz() methods in java.
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age; // 'this' refers to the current object
    }

    public void setName(String name) {
        this.name = name; // 'this' refers to the current object
    }
}

public class encapsulation_Using_This {
    public static void main(String[] args) {
        encap1 obj = new encap1();
        obj.setAge(21);
        obj.setName("vamsi Narasimha");

        System.out.println("Name: " + obj.getName() + "\nAge: " + obj.getAge());
    }
}
