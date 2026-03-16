package super_keyword;

class Krish{
    Krish(int a){
        System.out.println(a);
        System.out.println("Krish Constructor");
    }
}
class Bheem extends Krish{
    Bheem(){
        super(10);
        System.out.println("Bheem Constructor");    
    }
}
class Super_Keyword5{
    public static void main(String[] args) {
        Bheem obj = new Bheem();
    }
}