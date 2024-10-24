package composite;

public class Main {
    public static void main(String[] args) {
        Task task = new IndividualTask("task1");
        Task task2 = new IndividualTask("task2");

        Task tasks = new GroupTask("Group task");

        tasks.add(task);
        tasks.add(task2);

        tasks.complete();
    }
}
