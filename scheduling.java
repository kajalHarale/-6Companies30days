import java.util.*;
class MyTask extends TimerTask {
   public void run() {
      System.out.println("Task is running");
   }
}
public class Example {
   public static void main(String[] args) {
      Timer timer = new Timer(); // creating timer
      TimerTask task = new MyTask(); // creating timer task
      timer.schedule(task, new Date()); // scheduling the task
   }
   public void run() {
      System.out.println("Performing the given task");
   }
}