public class Main{
    public static void main(String[] args) {
        // make new object
        IronMan ironMan = new IronMan("Iron Man", 100, "Laser",30, 5);
        Spiderman spiderman = new Spiderman("Spiderman", 100, "Web", 20, 10);

        spiderman.attackSkill(ironMan);
        ironMan.attackSkill(spiderman);
        spiderman.attackSkill(ironMan);
        ironMan.attackSkill(spiderman);

        spiderman.attackSkill(ironMan);
        ironMan.attackSkill(spiderman);

        spiderman.attackSkill(ironMan);

    }
}