package oobootcamp.solid.openclose.version2;

public class Reader {

    public String read(Readable readable) {
        return readable.read();
    }

    public static void main(String[] args) {
        Reader reader = new Reader();

        reader.read(new Newspaper("articles"));
        reader.read(new Book("adventures"));
    }
}
