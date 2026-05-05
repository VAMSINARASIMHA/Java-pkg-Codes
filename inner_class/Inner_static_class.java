package inner_class;

class outer
{
    void show()
    {
        System.out.println("HAI");
    }
    static class inner
    {
        void display()
        {
            System.out.println("VAMSI");
        }
    }
}
public class Inner_static_class{
    public static void main(String[] ar){
        outer obj = new outer();
        obj.show();

        outer.inner obj1 = new outer.inner();
        obj1.display(); 
    }
}

//note :- here static variable is applicable for inner class but not for outer class. we can create object for inner class without creating object for outer class.
//here static is used for only inner class not for outer class.

