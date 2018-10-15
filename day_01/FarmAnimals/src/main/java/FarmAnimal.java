public abstract class FarmAnimal {

    private String species;


    public FarmAnimal(String species) {
        this.species = species;
    }

    public String introduceYourself() {
        return "Hi, I am ";
    }

}
