package oobootcamp.solid.liskov;

public class TestMain {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(4);

        // Get Rectangle areas
        rect.getAreas();

        // If we substitude with rectangle
        Rectangle rectangle = new Square();
        rectangle.setLength(5);
        rectangle.setWidth(4);

        // Get Rectangle areas
        rectangle.getAreas();
    }
}
