public abstract class Hero {
    // attribute
    private String name;
    private double health;
    private String skill;
    private double attackPower;
    private double defencePower;
    private int level = 0;
    private double xp = 0;
    private double xpForLevelUp = 200;

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

    public double getXp(){
        return this.xp;
    }

    ///////////////////////////////////////////////////////////////
    
    
    // function to add xp
    public void addXp(){
        this.xp += 100;
        System.out.println(this.name + "'s experience add to " + this.xp);
    }

    // function for level up
    public void levelUp(double xp){
        if (xp >= xpForLevelUp){
            level += 1;
            xpForLevelUp += 200;
            System.out.println("Congrats! " + this.name + " reaching level " + this.level);
        }
    }

    // function for receiving damage
    public void takeDamage(double damage){
        double getDamage = damage - this.defencePower;
        System.out.println(this.name + " receiving " + getDamage + " damage\n");
        this.health = health - damage + this.defencePower;
        display();
    }

    public abstract void show();
}
