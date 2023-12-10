package HWANIMALS.ANIMALS;

public class Cat extends HomeAnimals{
    public Cat(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}