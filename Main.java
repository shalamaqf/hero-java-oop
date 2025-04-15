public class Main{
    public static void main(String[] args) {
        // make new object
        Hero hero1 = new HeroStrength("Iron man", 100, 15, 5);
        hero1.display();

        Hero hero2 = new HeroAgility("Spiderman", 100, 20, 10);
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.show();
        hero2.show();
    }
}