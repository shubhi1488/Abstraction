//Abstarction
abstract class Bike {
    abstract void run();//method contains only body it doesnot contain any implementation

}
class Honda extends Bike{

    @Override
    void run() {
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Bike obj=new Honda();
        obj.run();
    }
}
