package HWANIMALS.ANIMALS;

import java.util.ArrayList;

public class HomeAnimals extends animals{


    public HomeAnimals(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Pet {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
