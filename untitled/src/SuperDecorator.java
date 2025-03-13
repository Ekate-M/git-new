public class SuperDecorator implements SuperHero {
    SuperHero superHero;

    public SuperDecorator(SuperHero superHero) {
        this.superHero = superHero;
    }

    @Override
    public String superPower() {
        return superHero. superPower();
    }
}
