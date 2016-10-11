package oobootcamp.solid.openclose.version2;

public class Book implements Readable {

    private String content;

    public Book(String content) {
        this.content = content;
    }

    public String read() {
        return content;
    }
}
