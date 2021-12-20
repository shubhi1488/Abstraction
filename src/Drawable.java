interface Drawable {
    void draw();

    static int cube(int x){
        return x*x*x;
    }
}
class Test4 implements Drawable{

    @Override
    public void draw() {
        System.out.println("we are drawing");
    }

    public static void main(String[] args) {
        Test4 obj=new Test4();
        obj.draw();
        System.out.println(Drawable.cube(6));
    }
}
