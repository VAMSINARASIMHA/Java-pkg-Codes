package constructor;
class Const1{
    public String str;
    private int age;
    int p;
    int q;
    
Const1(){
    System.out.println("Constructor1");
     p=11;
     q=12;
     return;
}


public Const1(String a,int b){
    System.out.println("Constructor2");
    str=a;
    age=b;
    return;
}


public static void main(String[] args){
    Const1 s1 = new Const1(); //type1 constructor
    Const1 s2 = new Const1(); //type1 constructor
    Const1 s3 = new Const1("ravi",10); //type2 constructor
    Const1 s4 = new Const1("ram",20); //type2 constructor
    
  
    System.out.println(s1.p+s1.q);
    System.out.println(s2.p+s2.q);
    System.out.println(s3.str+" "+s3.age);
    System.out.println(s4.str+" "+s4.age);
    
    }
}    
