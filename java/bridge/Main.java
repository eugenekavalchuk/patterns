package bridge;

public class Main {
    public static void main(String[] args) {
        Shape windowShape = new Circle(new WindowsAPI());
        Shape macosShape = new Circle(new MacOSAPI());

        windowShape.draw();
        macosShape.draw();
    }
}
