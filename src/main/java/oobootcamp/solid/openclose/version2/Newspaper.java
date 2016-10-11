package oobootcamp.solid.openclose.version2;

public class Newspaper implements Readable {
    private String content;

    public Newspaper(String content) {
        this.content = content;
    }

    @Override
    public String read() {
        return content;
    }
}
