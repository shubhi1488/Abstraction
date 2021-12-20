//interface- this is used to attain total abstarction which contains abstract methos which donot contain any method body
interface printable {
    void print();

}
class A2 implements printable{

    @Override
    public void print() {
        System.out.println("Welcome! Your are learning interface");
    }

    public static void main(String[] args) {
        A2 obj=new A2();
        obj.print();
    }
}
