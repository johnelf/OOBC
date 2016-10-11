package oobootcamp.solid.openclose.version1;

public class Book {

    private String content;

    public Book(String content) {
        this.content = content;
    }

    public String read() {
        return content;
    }
}
