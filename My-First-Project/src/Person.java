public class Person {

    int age;
    String name;

    void init(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "(" + name + ", " + age + ")";
    }

}
