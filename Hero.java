public abstract class Hero {
    // attribute
    private String name;
    private double health;

    // constructor
    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
    }
}
