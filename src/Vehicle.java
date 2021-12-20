//abstarct class containing constructor,abstract and non-abstract methods
abstract class Vehicle {
    public Vehicle() {
        System.out.println("vehicle is running");
    }
    abstract void run();
    void changegear(){
        System.out.println("gear changed");
    }

}
class Honda2 extends Vehicle{

    @Override
    void run() {
        System.out.println("running safely");
    }
}
class TestAbstraction{
    public static void main(String[] args) {
        Vehicle obj=new Honda2();
        obj.run();
        obj.changegear();

    }
}
