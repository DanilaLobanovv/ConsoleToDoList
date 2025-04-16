package todolist;

import java.util.Scanner;

public class toDoList {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        FileStorage fileStorage = new FileStorage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\"add\' \"remove\" \"list\" \"complete\" \"save\" \"exit\"");
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    taskManager.addTask();
                    break;
                case "remove":
                    taskManager.deleteTask();
                    break;
                case "list":
                    taskManager.listTasks();
                    break;
                case "complete":
                    taskManager.completeTask();
                    break;
                case "save":
                    fileStorage.saveTasksToFile(taskManager.getTasks(),"tasks.txt");
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Неизвестная команда");
            }
            System.out.println();
        }
    }
}
