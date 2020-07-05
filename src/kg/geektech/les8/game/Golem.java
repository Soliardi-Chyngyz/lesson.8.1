package kg.geektech.les8.game;

import kg.geektech.les8.players.Boss;
import kg.geektech.les8.players.Hero;
import kg.geektech.les8.players.SuperAbility;

public class Golem extends Hero {
    public Golem(int damage, int health, String name) {
        super(damage, health, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (heroes[6].getHealth() > 0){
            System.out.println("Golem блокирует 1/5 удара Босса");
        }
    }
}
