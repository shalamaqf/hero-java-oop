public abstract class Hero {
    // attribute
    private String name;
    private double health;
    private double attackPower;
    private double defencePower;

    // constructor
    Hero(String name, double health, double attackPower, double defencePower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Power : " + this.attackPower);
        System.out.println("Defence : " + this.defencePower);
    }

    // getter
    public String getName(){
        return this.name;
    }

    public void attack(Hero enemy){
        System.out.println(this.name + " attacking " + enemy.getName() + " with " + this.attackPower + " damage\n");
        enemy.takeDamage(attackPower);
    }

    public void takeDamage(double damage){
        System.out.println(this.name + " receiving " + damage + " damage\n");
        this.health = health - damage + this.defencePower;
        display();
    }

    public abstract void show();
}
