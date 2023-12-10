package HWANIMALS.ANIMALS;

public class PackAnimals extends animals {
    public PackAnimals(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Pack Animal {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}