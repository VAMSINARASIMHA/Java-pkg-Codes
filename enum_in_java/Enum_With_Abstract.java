package enum_in_java;

// Enum with Abstract Method
enum Shape {

    CIRCLE {
        void draw() {
            System.out.println("Drawing Circle");
        }
    },

    RECTANGLE {
        void draw() {
            System.out.println("Drawing Rectangle");
        }
    };

    abstract void draw();
}

public class Enum_With_Abstract{

    public static void main(String[] args) {

        Shape.CIRCLE.draw();
        Shape.RECTANGLE.draw();
    }
}
