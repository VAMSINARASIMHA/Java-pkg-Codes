package constructor;

class Const2{
    public String str;
    private int age;
    int p;
    int q;
    
Const2(){
    System.out.println("Constructor1");
     p=11;
     q=12;
}
void show(){
    System.out.println(p+q);
}




public Const2(String a,int b){
    System.out.println("Constructor2");
    str=a;
    age=b;
}

void display() {
        System.out.println(str + " " + age);
        
    }
    
    
public static void main(String[] args){
    Const2 s1 = new Const2(); //type1 constructor
    Const2 s2 = new Const2(); //type1 constructor
    Const2 s3 = new Const2("ravi",10); //type2 constructor
    Const2 s4 = new Const2("ram",20); //type2 constructor
    
    
    s1.show(); //if we comment this line """s1.show();""" then also their is no change in output it defaultly prints the '''Constructor1''' statement. 
    s2.show(); //if we comment this line """s2.show();""" then also their is no change in output it defaultly prints the '''Constructor1''' statement. 
    s3.display();
    s4.display();
    
    
    }
}

