
class A extends Thread{
  public void show(){
    for(int i = 0; i <= 100; i++){
      System.out.println("hi");
    }
  }
}

class B extends Thread{
  public void run(){
    for(int i = 0; i <= 100; i++){
      System.out.println("hello");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    
  }
}
