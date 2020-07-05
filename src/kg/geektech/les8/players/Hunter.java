package kg.geektech.les8.players;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int damage, int health, String name) {
        super(damage, health, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int event = random.nextInt(4);
        if (event == 1) {
            Random pardon = new Random();
            int r = pardon.nextInt(9);
            int defense = 20 - r + 10;
            heroes[4].setDamage(defense + 25);
            System.out.println("Hunter получил часть удара от Босса и вернул ему добавив от себя " + heroes[4].getDamage());
        }
    }
}
