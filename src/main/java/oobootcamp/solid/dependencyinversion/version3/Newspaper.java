package oobootcamp.solid.dependencyinversion.version3;

public class Newspaper implements Readable{
    @Override
    public String getContent() {
        return "This is newspaper";
    }
}
