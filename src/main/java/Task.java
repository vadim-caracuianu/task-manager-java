// A Task represents one task in our application.
//
// Data:
// - id
// - title
// - description
// - completion state
//
// Behaivor:
// - complete()
// - uncomplete()

public class Task {

  private int id;
  private String title;
  private String description;
  private boolean completed;
  
  public Task(int id, String title, String description, boolean completed) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.completed = completed;
  }

  public void complete() {
    this.completed = true;
  }

  public void uncomplete() {
    this.completed = false;
  }

  public boolean isCompleted() {
    return completed;
  }

  public String toString() {
    return id + " | " + title + " | " + description + " | " + completed;
  }

  public int getId() {
    return id;
  }
}


