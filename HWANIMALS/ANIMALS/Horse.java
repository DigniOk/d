package HWANIMALS.ANIMALS;

public class Horse extends PackAnimals{
    public Horse(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Horse {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
