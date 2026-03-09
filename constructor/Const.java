package constructor;
class Const{
    int a;
    String str;
    Const(){
        a=10;        //if we mention int a=10; then it shows '0' as output
        str ="Ram"; //if we mention String str ="Ram"; then it shows 'null' as output. 
    }
    public static void main(String[] args){
        Const s1 = new Const();
        System.out.println(s1.a +" "+s1.str);
    }
}
