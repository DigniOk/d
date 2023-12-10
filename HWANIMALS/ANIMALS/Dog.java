package HWANIMALS.ANIMALS;

public class Dog extends HomeAnimals{
    public Dog(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
