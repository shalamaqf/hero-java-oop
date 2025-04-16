public abstract class Hero {
    // attribute
    private String name;
    private double health;
    private String skill;
    private double attackPower;
    private double defencePower;

    // constructor
    Hero(String name, double health, String skill, double attackPower, double defencePower){
        this.name = name;
        this.health = health;
        this.skill = skill;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Skill : " + this.skill);
        System.out.println("Power : " + this.attackPower);
        System.out.println("Defence : " + this.defencePower);
    }

    // getter
    public String getName(){
        return this.name;
    }

    public String getSkill(){
        return this.skill;
    }

    public double getAttackPower(){
        return attackPower;
    }

    public void takeDamage(double damage){
        System.out.println(this.name + " receiving " + damage + " damage\n");
        this.health = health - damage + this.defencePower;
        display();
    }

    public abstract void show();
}
