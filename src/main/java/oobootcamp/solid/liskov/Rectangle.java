package oobootcamp.solid.liskov;

public class Rectangle {
    protected Integer length;
    protected Integer width;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getAreas() {
        return this.getLength() * this.getWidth();
    }
}
