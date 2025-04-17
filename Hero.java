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
    private boolean isAlive = true;

    // constructor
    Hero(String name, double health, String skill, double attackPower, double defencePower){
        this.name = name;
        this.health = health;
        this.skill = skill;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    ///////////////////////////////////////////////////////////////

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

    public double getXpForLevelUp(){
        return this.xpForLevelUp;
    }

    public int getLevel(){
        return this.level;
    }

    /////////////////////////////////////////////////////////////

    // setter
    public void setAttackPower(double power){
        this.attackPower = power;
    }

    public void setDefencePower(double power){
        this.defencePower = power;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setXpForLevelUp(double addXpForLevelUp){
        this.xpForLevelUp = addXpForLevelUp;
    }


    ///////////////////////////////////////////////////////////////

    // function to display hero's attribute
    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Skill : " + this.skill);
        System.out.println("Level : " + this.level);
        System.out.println("Xp : " + this.xp);
    }
    
    // function to add xp
    public void addXp(){
        this.xp += 100;
        System.out.println(this.name + "'s experience add to " + this.xp);
    }

    // function to check alive or dead
    public boolean isDead(){
        if (this.health <= 0){
            this.health = 0;
            this.isAlive = false;
        }

        return this.isAlive;
    }
    
    // function for receiving damage
    public void takeDamage(double damage){
        double getDamage = damage - this.defencePower;
        System.out.println(this.name + " receiving " + getDamage + " damage");
        this.health = health - damage + this.defencePower;
        
        if (!isDead()){
            display();
            System.out.println(this.name + " is dead. . .");
        }else{
            display();
        }
    }
        
    // abstract method
    public abstract void show();
    public abstract void levelUp(double xp);
    
}
