package oobootcamp.solid.interfacesegregation.version2;

public class Builder implements Worker, Diet {
    @Override
    public String eat() {
        return "eat something";
    }

    @Override
    public void work() {
        System.out.println("working");
    }
}
