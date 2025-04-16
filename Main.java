public class Main{
    public static void main(String[] args) {
        // make new object
        IronMan ironMan = new IronMan("Iron man", 100, "Laser",30, 5);
        ironMan.display();

        Spiderman spiderman = new Spiderman("Spiderman", 100, "web", 20, 10);
        spiderman.display();

        ironMan.attackSkill(spiderman);
        spiderman.attackSkill(ironMan);
        ironMan.attackSkill(spiderman);
    }
}