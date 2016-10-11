package oobootcamp.solid.interfacesegregation.version1;

public class Builder implements Worker {
    @Override
    public void work() {
        System.out.println("working");
    }

    @Override
    public String eat() {
        return "eat something";
    }
}
