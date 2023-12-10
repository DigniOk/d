package HWANIMALS.ANIMALS;

public class Donkey extends PackAnimals{
    public Donkey(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Donkey {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}