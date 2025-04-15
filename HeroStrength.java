public class HeroStrength extends Hero{
    // attribute
    private String heroType = "Strength";
    
    // constructor
    HeroStrength(String name, double health, double attackPower, double defencePower){
        super(name, health, attackPower, defencePower);
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
