package super_keyword;

class Ramesh{
    Ramesh(){
        System.out.println("Constructor of Rammesh");
    }
}
class Suresh extends Ramesh{
    Suresh(){
        super(); // Call the parent constructor  note: if we do not call super() method here then also the parent constructor will be called by default.
        System.out.println("Constructor of Suresh");
    }
}
public class Super_Keyword4 {
    public static void main(String[] args){
        Suresh obj = new Suresh();
    }
}
// super() must be the first statement in the constructor
// It is automatically called if not written.
