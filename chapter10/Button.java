public class Button {
    Task task;
    Button(Task inputTask) {
        this.task = inputTask;
    }

    public void click() {
        this.task.run();

    }
}