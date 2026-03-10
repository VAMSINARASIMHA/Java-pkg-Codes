package constructor;

class cons{
    int a; //instance variable
    String str; //instance variable
    cons(){
        this.a=10; //if we mention int a=10; then it shows '0' as output
        this.str ="Ram"; //if we mention String str ="Ram"; then it shows 'null' as output. and here '''this''' keyword is refers to instance variable
    }
    public static void main(String[] args){
        cons s1 = new cons();
        System.out.println(s1.a +" "+s1.str);
    }
}


/*

class cons{
    int a; //instance variable.
    String str; //instance variable.
    cons(){
        a=a; //if we mention int a=10; (or) a=a then it shows '0' as output
        str=str ; //if we mention String str ="Ram"; (or) str=str  then it shows 'null' as output. and here '''this''' keyword is refers to instance variable
    }
    public static void main(String[] args){
        cons s1 = new cons();
        System.out.println(s1.a +" "+s1.str);
    }
}

//here, Both refer to constructor parameters(a=a,str=str), not a instance variables(int a,String str).


*/