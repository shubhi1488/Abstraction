//multiple inheritance in interface
interface Demo {
    void print();
}
interface Showable{
    void show();
}
//class A3 is implementing two interfaces and their methods
class A3 implements Demo,Showable{

    @Override
    public void print() {
        System.out.println("Welcome!");
    }

    @Override
    public void show() {
        System.out.println("You are using intellij");

    }

    public static void main(String[] args) {
        A3 obj=new A3();
        obj.print();
        obj.show();
    }
}
