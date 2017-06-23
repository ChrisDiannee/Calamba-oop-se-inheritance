package ConstructorBehavior;
public class BDemo {
    public static void main(String[] args) {
        B b= new B();
        B b1 = new B(true);
        System.out.println(b.getZ());
    }
}
