public abstract class Hero {
    // attribute
    private String name;
    private double health;
    private String skill;
    private double attackPower;
    private double defencePower;
    private double level = 0;
    private double xp = 0;
    private double xpForLevelUp = xp;

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
        System.out.println("Level : " + this.level);
        System.out.println("Xp : " + this.xp);
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

    // function to add xp
    public void addXp(){
        this.xp += 100;
    }

    // function for receiving damage
    public void takeDamage(double damage){
        System.out.println(this.name + " receiving " + damage + " damage\n");
        this.health = health - damage + this.defencePower;
        display();
    }

    public abstract void show();
}
