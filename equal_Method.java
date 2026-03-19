/*
//Type:1

public class pra {
    public static void main(String[] args) {

        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);        // false
        System.out.println(a.equals(b)); // true
    }
}
*/










/*
Type:2

class Laptop {
    String name;

    Laptop(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        Laptop l = (Laptop) obj;
        return this.name.equals(l.name);
    }
}

public class pra {
    public static void main(String[] args) {
        Laptop a = new Laptop("Java");
        Laptop b = new Laptop("Java");
        Laptop c = new Laptop("Python");

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // false
    }
}

*/





//Main Usage Example ---> Type:3

class Laptop {
    String name;

    Laptop(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Laptop l = (Laptop) obj;
        return name.equals(l.name);
    }
}

public class equal_Method {
    public static void main(String[] args) {
        Laptop a = new Laptop("Java");
        Laptop b = new Laptop("Java");
        Laptop c = new Laptop("Python");

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // false
    }
}
