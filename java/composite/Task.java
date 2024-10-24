package composite;

public interface Task {
    void complete();
    void add(Task task);
}
