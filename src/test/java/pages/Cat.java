package pages;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(getClass() + " " + name + " is meowing!");
    }

}
