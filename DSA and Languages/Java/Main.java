class MyRunnable implements Runnable {
  public void run() {
    // Thread execution logic
  }
}

public class Main {
  public static void main(String[] args) {

    // Creating and starting a thread using Runnable
    Thread thread = new Thread(new MyRunnable());
    thread.start();

  }
}
