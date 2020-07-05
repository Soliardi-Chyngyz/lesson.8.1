package kg.geektech.les8.game;

import kg.geektech.les8.players.Boss;
import kg.geektech.les8.players.Hero;
import kg.geektech.les8.players.SuperAbility;

import java.sql.SQLOutput;
import java.util.Random;

public class Witcher extends Hero {

    public Witcher(int damage, int health, String name) {
        super(damage, health, SuperAbility.SAVE_LIFE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if(heroes[7].getHealth() > 0){
            Random random = new Random();
            int event = random.nextInt(2);
            if (event == 1)
            for (int i = 0; i < heroes.length; i++) {
                if(heroes[i].getHealth() <= 0 && heroes[7].getHealth() > 0){
                    heroes[i].setHealth( + heroes[7].getHealth());
                    heroes[7].setHealth(0);
                    System.out.println("Witcher отдал остаток своей жизни " + heroes[i].getName() + "y");
                }
            }
        }
    }
}
