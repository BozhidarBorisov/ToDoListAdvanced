import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    public TaskManager() {
        tasks = FileHandler.loadTasks();
    }
    public void saveTasksToFile() {
        FileHandler.saveTasks(tasks);
    }

    public void addTask(Task task) {
        tasks.add(task);
        FileHandler.saveTasks(tasks);
    }
    public void updateTask(int index, Task updatedTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, updatedTask);
            FileHandler.saveTasks(tasks);
        } else {
            System.out.println("Invalid task index. Task not updated.");
        }
    }
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task deletedTask = tasks.remove(index);
            System.out.println("Task deleted: " + deletedTask.getTitle());
            FileHandler.saveTasks(tasks);
        } else {
            System.out.println("Invalid task index. Task not deleted.");
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

}
