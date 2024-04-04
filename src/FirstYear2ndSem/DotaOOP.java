package FirstYear2ndSem;

import java.util.Scanner;

public class DotaOOP {

    public static void main(String[] args) {

        Hero axe = new Hero("Axe", 700, 291, 57, 2.33);
        Hero drowRanger = new Hero("Drow Ranger", 520, 255, 52, 3.33);
        Hero invoker = new Hero("Invoker", 500, 720, 49, 1.0);

        drowRanger.attack(axe);
        drowRanger.attack(axe);
        drowRanger.attack(axe);
        drowRanger.attack(axe);
        drowRanger.attack(axe);
        drowRanger.attack(axe);
        axe.attack(drowRanger);
        axe.displayStatus();

        double x = Math.PI;
    }

}

class Hero {
    static int heroCount = 0;
    private String name;
    private final double maxHealth;
    private double currentHealth;

    private final double maxMana;
    private double currentMana;

    private double damage;
    private double armor;
    private double damageReduction = (0.052 * armor) / (0.9 + (0.048 * armor));



    Hero(String name, double health, double mana, double damage, double armor) {
        this.name = name;

        this.maxHealth = health;
        this.currentHealth = health;

        this.maxMana = mana;
        this.currentMana = mana;

        this.damage = damage;
        this.armor = armor;
        heroCount += 1;
    }

    public void attack(Hero attackedHero) {

        double armorReducedDmg;

        armorReducedDmg = damage - (damage * damageReduction);
        attackedHero.currentHealth -= armorReducedDmg;

    }

    public void displayStatus() {
        System.out.println(name);
        System.out.printf("Current health: %.2f/%d\n", currentHealth, (int) maxHealth);
        System.out.printf("Current mana: %.2f/%d\n", currentMana, (int) maxMana);
    }

    public static void displayHeroCount() {
        System.out.println("There are " + heroCount + " heroes.");
    }


}
