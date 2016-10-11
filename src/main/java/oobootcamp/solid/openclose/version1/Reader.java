package oobootcamp.solid.openclose.version1;

public class Reader {

    public String read(Object readable) {
        if (readable instanceof Newspaper) {
            return ((Newspaper) readable).fetchArticles();
        } else if (readable instanceof Book) {
            return ((Book) readable).read();
        } else {
            return "I don't know what it is talking about";
        }
    }

    public static void main(String[] args) {
        Reader reader = new Reader();

        reader.read(new Newspaper("articles"));
        reader.read(new Book("adventures"));

    }
}
