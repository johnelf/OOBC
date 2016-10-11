package oobootcamp.solid.liskov;

public class Square extends Rectangle {
    @Override
    public void setLength(Integer length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(Integer width) {
        this.length = width;
        this.width = width;
    }
}
