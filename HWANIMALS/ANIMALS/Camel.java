package HWANIMALS.ANIMALS;

public class Camel extends PackAnimals{
    public Camel(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Camel {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}