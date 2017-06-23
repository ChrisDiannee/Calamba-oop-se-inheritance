package ConstructorBehavior;
public class B extends A{
    boolean z;
    B(){
        this.z = false;
        System.out.println("B: Empty constructor loaded.");
    }
    B(boolean z){
        super("dianne",18);
        this.z = z;
        System.out.println("B: Single(boolean) constructor loaded.");
  
    }
    boolean getZ(){return this.z;}    
}
