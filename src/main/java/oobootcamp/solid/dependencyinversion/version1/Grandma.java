package oobootcamp.solid.dependencyinversion.version1;

public class Grandma {
    public void narrate(Book book) {
        System.out.println("奶奶开始讲故事");
        System.out.println(book.getContent());
    }

    public static void main(String[] args) {
        Grandma grandma = new Grandma();
        grandma.narrate(new Book());
        //无法读报纸,只能读书,否则会报错
        grandma.narrate(new Newspaper());
    }
}
