package oobootcamp.solid.interfacesegregation.version1;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("work");
    }

    //Robot依赖了不需要的eat方法, 而且return null的实现违反了里氏替换
    @Override
    public String eat() {
        return null;
    }
}
