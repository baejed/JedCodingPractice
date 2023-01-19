public class Hero{

    String firstSkill = "Skill 1";
    String secondSkill = "Skill 2";
    String thirdSkill = "Skill 3";
    String ultimate = "Ultimate";

    int health = 700;
    int mana = 500;

    int armor = 0;
    static boolean damageInput = false;


    public Hero(String firstSkillName, String secondSkillName){

        firstSkill = firstSkillName;
        secondSkill = secondSkillName;

    }

    public Hero(){



    }


    public void takingDamage(int damage){

        health -= damage - (damage * (armor * 0.02));

        damageInput = true;

    }

    public void notTakingDamage(){

        damageInput = false;

    }

}

