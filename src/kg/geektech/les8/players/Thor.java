package kg.geektech.les8.players;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int damage, int health,  String name) {
        super(damage, health, SuperAbility.BLOCK_BOSS_DAMAGE_1_ROUND, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int event = random.nextInt(4);
        if (event == 1) {
            System.out.println("Thor заморозил Боса на 1 раунд");
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage() - 25);
            }
        }
    }
}
