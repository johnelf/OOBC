package oobootcamp.solid.openclose.version1;

public class Newspaper {
    private String content;

    public Newspaper(String content) {
        this.content = content;
    }

    public String fetchArticles() {
        return content;
    }
}
