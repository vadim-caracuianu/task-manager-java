public class Main {

  public static void main(String[] args) {
   
    TaskManager manager = new TaskManager();

    Task task1 = new Task(1, "Study Java", "Learn OOP", false);
    Task task2 = new Task(2, "Study Networks", "TCP/IP", false);

    manager.addTask(task1);
    manager.addTask(task2);

    manager.listTasks();
  }
}
