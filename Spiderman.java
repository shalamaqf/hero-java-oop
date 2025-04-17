public class Spiderman extends Hero implements IAttackSKill, IAddPower{
    // attribute
    private String heroType = "Agility";
    
    // constructor
    Spiderman(String name, double health, String skill, double attackPower, double defencePower){
        super(name, health, skill, attackPower, defencePower);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void display(){
        super.display();
        System.out.println("Type : " + this.heroType);
    }

    @Override
    public void show(){
        System.out.println("I'm " + this.getName() + "!");
    }

    @Override
    public void attackSkill(Hero enemy){
        System.out.println("\n" + this.getName() + " attacking " + enemy.getName() + " with " + this.getSkill());
        enemy.takeDamage(this.getAttackPower());
        addXp();
        levelUp(this.getXp());
    }

    @Override
    public void addPower(double power){
        this.setAttackPower(this.getAttackPower() + 30);
    }

    // function for level up
    public void levelUp(double xp){
        if (this.getXp() >= this.getXpForLevelUp()){
            this.setLevel(this.getLevel() + 1);
            this.setXpForLevelUp(this.getXpForLevelUp() + this.getXpForLevelUp());
            System.out.println("Congrats! " + this.getName() + " reaching level " + this.getLevel());

            addPower(this.getXp());
        }
    }
}
