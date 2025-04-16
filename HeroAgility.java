public class HeroAgility extends Hero{
    // attribute
    private String heroType = "Agility";
    
    // constructor
    HeroAgility(String name, double health, String skill, double attackPower, double defencePower){
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
}
