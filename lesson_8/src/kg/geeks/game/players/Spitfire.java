package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Spitfire extends Hero {
    private boolean isAngry = false;

    public Spitfire(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.ANGRY);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        for (Hero hero : heroes) {
            if (hero.getHealth() <= 0) {
                isAngry = true;
            }
        }
        if(isAngry){
            boss.setHealth(boss.getHealth() - 80);
            System.out.println("Spitfire damaged boss + 80 point");
            isAngry = false;
        }
    }
}
