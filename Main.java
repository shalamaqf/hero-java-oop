public class Main{
    public static void main(String[] args) {
        // make new object
        HeroStrength ironMan = new HeroStrength("Iron man", 100, "Laser",30, 5);
        ironMan.display();

        HeroAgility spiderman = new HeroAgility("Spiderman", 100, "web", 20, 10);
        spiderman.display();

        ironMan.attackSkill(spiderman);
        spiderman.attackSkill(ironMan);
    }
}