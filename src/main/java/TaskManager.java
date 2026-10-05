// TaskManager is responsible for managing multiple Task objects.
//
// Responsibilities:
// - store tasks 
// - add a task 
// - remove a task
// - find a task 
// - list tasks 

import java.util.ArrayList;

public class TaskManager {
  private ArrayList<Task> tasks;

  public TaskManager() {
    tasks = new ArrayList<>();
  }

  public void addTask(Task task) {
    tasks.add(task);
  }

  public void listTasks() {
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println(tasks.get(i));
    }
  }  

  public Task findTask(int id) {
    for (int i = 0; i < tasks.size(); i++) {
      Task task = tasks.get(i);

      if(id == task.getId()) {
        return task;
      }
    }

    return null;
  }
 
}
