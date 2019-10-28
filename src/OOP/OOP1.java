package hello;

public class OOP1 {
    static Cat cat = new Cat();
    static people people  = new people();

    public static void main (String[] args) {

        cat.name = "Jorge";
        cat.poroda = " Pers";
        cat.age = 2;

        people.name = "Marat";
        people.fam = "Mukmenov";
        people.age = 29;
        people.cat = cat;


        System.out.println(people);
        cat.say();


    }
}
