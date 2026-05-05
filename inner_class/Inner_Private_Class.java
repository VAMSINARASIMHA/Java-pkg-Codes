package inner_class;

class Outer {
    private class Inner {
        void show() {
            System.out.println("Inside Private Inner Class");
        }
    }

    public void accessInner() {
        Inner obj = new Inner(); // allowed (inside Outer)
        obj.show();
    }
    
}

public class Inner_Private_Class {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.accessInner(); // accessing through outer method
    }
}
