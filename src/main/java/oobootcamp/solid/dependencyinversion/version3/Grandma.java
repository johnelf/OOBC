package oobootcamp.solid.dependencyinversion.version3;

public class Grandma {
    public void narrate(Readable thingsToRead) {
        System.out.println("奶奶开始讲故事");
        System.out.println(thingsToRead.getContent());
    }

    public static void main(String[] args) {
        Grandma grandma = new Grandma();

        //不依赖于底层实现, 依赖于接口(抽象)后, grandma只需要一个可以用来读的东西就可以开始讲故事了
        grandma.narrate(new Book());
        grandma.narrate(new Newspaper());
        grandma.narrate(new Tablet());
    }
}
