package FirstYear2ndSem;

public class DotaOOP {

    public static void main(String[] args) {

        Hero axe = new Hero("Axe", 700, 291, 57, 2.33);
        Hero drowRanger = new Hero("Drow Ranger", 520, 255, 52, 3.33);

        drowRanger.attack(axe);
        drowRanger.attack(axe);
        drowRanger.attack(axe);
        drowRanger.attack(axe);
        drowRanger.attack(axe);
        drowRanger.attack(axe);
        axe.displayStatus();

    }

}

class Hero {

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
    }

    public void attack(Hero attackedHero) {

        double armorReducedDmg;

        armorReducedDmg = damage - (damage * damageReduction);
        attackedHero.currentHealth -= armorReducedDmg;

    }

    public void displayStatus() {
        System.out.println(name);
        System.out.printf("Current health: %.2f/%d\n", currentHealth, (int)maxHealth);
        System.out.printf("Current mana: %.2f/%d\n", currentMana, (int)maxMana);
    }


}
