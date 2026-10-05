import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    TaskManager manager = new TaskManager();

    while (true) {
      System.out.println("\n=== TASK MANAGER ===");
      System.out.println("1. Add task");
      System.out.println("2. List tasks");
      System.out.println("3. Complete task");
      System.out.println("4. Delete task");
      System.out.println("5. Exit");

      System.out.println("Choose: ");

      try {
        int choice = scanner.nextInt();

        if (choice == 1) {
          
          System.out.println("What is the task id?");
          int id = scanner.nextInt();
          scanner.nextLine();

          System.out.println("What is the task name?");

          String name;
          do {
              System.out.print("Enter task name: ");
              name = scanner.nextLine();
          } while (name.isBlank());

          System.out.println("What is the task description?");
          String description = scanner.nextLine();

          Task task = new Task(id, name, description, false);
        
          if (manager.addTask(task)) {
            System.out.println("Task added Successfully");
          } else {
            System.out.println("Task was not added");
          }
        }
        
        if (choice == 2) {
          manager.listTasks();
        }

        if (choice == 3) {
          System.out.println("What is the task id?");
          int id = scanner.nextInt();
          
          if (manager.completeTask(id)) {
            System.out.println("Task completed successfully");
          } else {
            System.out.println("Task isn't on the list. ");
          }
        }

        if (choice == 4) {
          System.out.println("What is the task id?");
          int id = scanner.nextInt();
          
          if (manager.deleteTask(id)) {
            System.out.println("Task deleted successfully. ");
          } else {
            System.out.println("Task isn't on the list. ");
          }
        }

        if (choice == 5) {
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. ");
      }
    }
    scanner.close();
  }
}
