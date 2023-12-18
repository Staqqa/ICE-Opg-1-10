public abstract class Animal {
    protected String name;
    protected boolean isMammal;

    public Animal(String name, boolean isMammal) {
        this.name = name;
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void makeSound();
}

