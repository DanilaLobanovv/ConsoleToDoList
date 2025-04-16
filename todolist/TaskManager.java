package todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    Scanner scanner = new Scanner(System.in);
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void addTask() {
        Task task = new Task();
        task.setId(tasks.size() + 1);

        System.out.println("Название задачи: ");
        task.setTitle(scanner.nextLine());

        System.out.println("Срок выполнения (гггг-мм-дд): ");
        task.setDate(LocalDate.parse(scanner.nextLine()));

        System.out.println("Приоритет задачи: ");
        task.setPriority(scanner.nextLine());

        tasks.add(task);
        System.out.println("Задача добавлена");
    }

    public void deleteTask() {
        System.out.println("id ненужной задачи: ");
        int removeId = scanner.nextInt();

        tasks.removeIf(task -> task.getId() == removeId);
    }

    public void listTasks() {
        for (Task task : tasks) {
            String status = task.isComplete() ? "[x]" : "[ ]";
            System.out.printf("%s %d, %s, %s, %s",
                    status, task.getId(), task.getTitle(), task.getDate(),
                    task.getPriority());
            System.out.println();
        }
    }

    public void completeTask() {
        System.out.println("id выполненой задачи: ");
        int addId = scanner.nextInt();

        tasks.stream()
                .filter(task -> task.getId() == addId)
                .findFirst()
                .ifPresent(task -> task.setComplete(true));
    }
}
