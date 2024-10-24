package composite;

import java.util.ArrayList;
import java.util.List;

public class GroupTask implements Task {
    private String taskGroupName;
    private List<Task> tasks = new ArrayList<>();

    public GroupTask(String taskGroupName) {
        this.taskGroupName = taskGroupName;
    }

    @Override
    public void show() {

    }

    @Override
    public void complete() {
        tasks.forEach(Task::complete);
    }

    @Override
    public void add(Task task) {
        tasks.add(task);
    }
}
