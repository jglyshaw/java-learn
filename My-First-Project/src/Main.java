import game.Enemy;

public class Main {
    public static void main(String[] args) {

        Person josiah = new Person();
        josiah.init(23, "Josiah");
        System.out.println(josiah);

        Enemy e1 = new Enemy();
        e1.health = 3;
        System.out.println(e1.health);
    }
}
