package hello;

public class Cat {
    int age;
    String poroda;
    String name;

    void say() {
        System.out.println(" Meuuuu");
    }

    @Override
    public String toString() {
        return "Cat(name" + name + ", poroda: " + poroda + "-" + age + "2)";
    }
}
