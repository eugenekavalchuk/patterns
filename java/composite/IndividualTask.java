package composite;

public class IndividualTask implements Task {
    private String taskName;

    public IndividualTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void show() {

    }

    @Override
    public void complete() {

    }

    @Override
    public void add(Task task) {
        throw new UnsupportedOperationException();
    }
}
