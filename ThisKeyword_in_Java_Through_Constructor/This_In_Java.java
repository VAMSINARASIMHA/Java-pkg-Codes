package ThisKeyword_in_Java_Through_Constructor;

public class This_In_Java {

    int x = 100;  // Instance variable

    void show() {
        int x = 50;  // Local variable 
        System.out.println(x);        // 50 (it refers the Local variable)
        System.out.println(this.x);   // 100 (it refers the Instance variable)
        
    }
    public static void main(String[] ar){
        This_In_Java s1 = new This_In_Java();
        s1.show();
    }
}

/*
x → refers to local variable
this.x → refers to instance variable
*/
