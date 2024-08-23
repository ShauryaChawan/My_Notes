public class TaskManagementSystem {

  public static void main(String[] args) {
    // Create and start threads for different tasks
    Thread dataProcessingThread = new Thread(new DataProcessingTask());
    Thread notificationSendingThread = new Thread(new NotificationSendingTask());
    Thread backgroundCalculationThread = new Thread(new BackgroundCalculationTask());

    dataProcessingThread.start();
    notificationSendingThread.start();
    backgroundCalculationThread.start();

    try {
      // Wait for all tasks to complete
      dataProcessingThread.join();
      notificationSendingThread.join();
      backgroundCalculationThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("All tasks have been completed.");
  }
}

// Task 1: Data Processing
class DataProcessingTask implements Runnable {
  @Override
  public void run() {
    System.out.println("Data processing task started by: " + Thread.currentThread().getName());
    try {
      // Simulate data processing
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Data processing task completed by: " + Thread.currentThread().getName());
  }
}

// Task 2: Notification Sending
class NotificationSendingTask implements Runnable {
  @Override
  public void run() {
    System.out.println("Notification sending task started by: " + Thread.currentThread().getName());
    try {
      // Simulate sending notifications
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Notification sending task completed by: " + Thread.currentThread().getName());
  }
}

// Task 3: Background Calculation
class BackgroundCalculationTask implements Runnable {
  @Override
  public void run() {
    System.out.println("Background calculation task started by: " + Thread.currentThread().getName());
    try {
      // Simulate background calculation
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Background calculation task completed by: " + Thread.currentThread().getName());
  }
}
