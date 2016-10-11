package oobootcamp.solid.dependencyinversion.version2;

public class Grandma {
    public void narrate(Book book) {
        System.out.println("奶奶开始讲故事");
        System.out.println(book.getContent());
    }

    public static void main(String[] args) {
        Grandma grandma = new Grandma();
        grandma.narrate(new Book());
        //然而Newspaper并不是book,因为override了超类的getContent方法,违反了里氏替换原则
        grandma.narrate(new Newspaper());
    }
}
