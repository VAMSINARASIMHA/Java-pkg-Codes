package Inheritance;
class vamsi{     //here """class vamsi extends Object""" by default as all the classes in java are child of Object class.
    int age;
}
class Narasmha extends vamsi{
    String name;
}
public class Single_Inheritance {
    public static void main(String[] args) {
        Narasmha n = new Narasmha();
        n.age = 21;
        n.name = "Vamsi Narasmha";
        System.out.println(n.name+" : "+n.age);
    }
}
