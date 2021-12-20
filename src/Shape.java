abstract class Shape {
    abstract void draw();
}
class rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("drawing rectangle");
    }
}
class circle extends Shape{

    @Override
    void draw() {
        System.out.println("drawing circle");
    }
}
class Test{
    public static void main(String[] args) {
        Shape obj=new circle();
        obj.draw();
        Shape obj2=new rectangle();
        obj2.draw();
    }
}
