public class HeroStrength extends Hero{
    // attribute
    private String heroType = "Strength";
    
    // constructor
    HeroStrength(String name, double health){
        super(name, health);
    }

    public void display(){
        super.display();
        System.out.println("Type : " + this.heroType + "\n");
    }
}
