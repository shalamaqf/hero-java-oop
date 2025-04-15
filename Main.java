public class Main{
    public static void main(String[] args) {
        // make new object
        Hero hero1 = new HeroStrength("Iron man", 100, 15, 20);
        hero1.display();

        Hero hero2 = new HeroAgility("Spiderman", 100, 20, 10);
        hero2.display();
    }
}