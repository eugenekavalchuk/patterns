package bridge;

public class Circle extends Shape {
    protected Circle(DrawingAPI drawingAPI) {
        super(drawingAPI);
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle();
    }
}
