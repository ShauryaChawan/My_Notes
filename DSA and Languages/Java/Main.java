abstract class A {
  public abstract void show();
}

public class Main {
  public static void main(String[] args) {
    
    /* Following line throws an error, 
    as abstract classes cannot be instantiated or 
    we cannot create an object of abstrract classes
    */
    // A obj = new A();

    // but following code works
    A obj = new A(){
      public void show(){
        System.out.println("in A show");
      }
    };
    obj.show(); // Output: in A show
  }
}