public class SuperHeroAgility extends SuperDecorator{
    public SuperHeroAgility(SuperHero superHero) {
        super(superHero);
    }
    public String SuperAgility() {
        return " , super agility ";
    }

    @Override
    public String superPower() {
        return super.superPower() + SuperAgility();
    }
}
