package Inheritance;

class Parent {
    void showParent() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is Child class");
    }
}

class Sub1 extends Child {
    void showSub1() {
        System.out.println("(This is Sub1 class) and it inherits the showChild() and showParent() methods.");
    }
}

class Sub2 extends Child {
    void showSub2() {
        System.out.println("(This is Sub2 class) and also it inherits the showChild() and showParent() methods.");
    }
}

public class Hybrid_Inheritance2 {
    public static void main(String[] args) {

        Sub1 obj1 = new Sub1();
        obj1.showParent();
        obj1.showChild();
        obj1.showSub1();

        System.out.println();

        Sub2 obj2 = new Sub2();
        obj2.showParent();
        obj2.showChild();
        obj2.showSub2();
    }
}

