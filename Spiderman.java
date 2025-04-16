public class Spiderman extends Hero implements IAttackSKill{
    // attribute
    private String heroType = "Agility";
    
    // constructor
    Spiderman(String name, double health, String skill, double attackPower, double defencePower){
        super(name, health, skill, attackPower, defencePower);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Type : " + this.heroType + "\n");
    }

    @Override
    public void show(){
        System.out.println("I'm " + this.getName() + "!");
    }

    @Override
    public void attackSkill(Hero enemy){
        System.out.println(this.getName() + " attacking " + enemy.getName() + " with " + this.getSkill());
        enemy.takeDamage(this.getAttackPower());
        addXp();
    }
}
