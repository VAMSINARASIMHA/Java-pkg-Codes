package encapsulation;
class encap{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class Encapsulation {
public static void main(String[] ar){
    encap e1 = new encap();
    e1.setAge(21); //setting the value of age using setter method
    e1.setName("vamsi");//setting the value of name using setter method
    System.out.println(e1.getName()+" : "+e1.getAge());//getting the value of name and age using getter method.
    }
}
