package todolist;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorage {
    public FileStorage() {}

    public void saveTasksToFile(List<Task> tasks, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Task task : tasks) {
                String status = task.isComplete() ? "[x]" : "[ ]";
                String str = String.format("%s %d, %s, %s, %s",
                        status, task.getId(), task.getTitle(),
                        task.getDate(), task.getPriority());
                writer.write(str + "\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка сохранения: " + e.getMessage());
        }
    }
}
