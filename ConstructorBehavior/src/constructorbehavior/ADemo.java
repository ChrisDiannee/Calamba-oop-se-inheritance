package ConstructorBehavior;
public class ADemo {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A("Dianne");
        A a2 = new A(18);
        A a3 = new A("Dianne",1);
        A a4 = new A("");
        a.setX("a");
        a.setY(9);
        System.out.println(a.getX());
        System.out.println(a.getY());
    }
}
