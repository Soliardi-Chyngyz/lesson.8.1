package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero{

    public Warrior(int damage, int health, String name) {
        super(damage, health, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int event = random.nextInt(3)+1;
        if (event == event) {
            heroes[0].setDamage(event * 15);
            System.out.println("Warrior умжножив свою силу ударил Босса " + heroes[0].getDamage() + " Умноженая сила " + event);
        }
    }
}
