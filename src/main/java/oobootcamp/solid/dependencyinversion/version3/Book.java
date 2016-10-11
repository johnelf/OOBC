package oobootcamp.solid.dependencyinversion.version3;

public class Book implements Readable {
    @Override
    public String getContent() {
        return "This is a book";
    }
}
