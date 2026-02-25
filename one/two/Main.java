package one.two;
import one.first; // or use """import one.*;""" to import all classes in the 'one' package, instead of importing import one.first; and import one.second; and import one.third; separately. 
import one.second;
import one.third;

public class Main {
    public static void main(String[] args) {

        first f = new first();
        second s = new second();
        third t = new third();

        f.show();
        s.show();
        t.show();
    }
}
