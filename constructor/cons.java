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