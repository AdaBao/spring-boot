package Test;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return this.name+" "+this.age;
    }
}