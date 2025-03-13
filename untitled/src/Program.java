public class Program {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHeroAgility(new SuperHeroIntelligence( new EarthSuperHero()));
        System.out.println (superHero.superPower());
    }
}
