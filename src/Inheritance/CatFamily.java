package Inheritance;

public class CatFamily {
    protected int legs;
    protected int eyes;
    protected boolean canEatPerson;

    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }

}
