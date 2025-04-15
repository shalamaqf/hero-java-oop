public class HeroAgility extends Hero{
    // attribute
    private String heroType = "Agility";
    
    // constructor
    HeroAgility(String name, double health, double attackPower, double defencePower){
        super(name, health, attackPower, defencePower);
    }

    public void display(){
        super.display();
        System.out.println("Type : " + this.heroType + "\n");
    }
}
