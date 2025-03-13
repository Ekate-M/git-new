public class SuperHeroIntelligence extends SuperDecorator{
    public SuperHeroIntelligence(SuperHero superHero) {
        super(superHero);
    }
    public String superIntelligence () {
        return " , super intelligence";
    }

    @Override
    public String superPower() {
        return super.superPower() + superIntelligence();
    }
}
