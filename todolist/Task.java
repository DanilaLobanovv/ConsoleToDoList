package todolist;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private LocalDate date;
    private String priority;
    private boolean isComplete;

    // Конструктор
    public Task(int id, String title, LocalDate date, String priority, boolean isComplete) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.priority = priority;
        this.isComplete = isComplete;
    }

    public Task() {}

    // Геттеры
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    // Сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
}
