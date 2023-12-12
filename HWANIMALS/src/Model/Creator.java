package HWANIMALS.src.Model;

import HWANIMALS.src.Model.PetType;
import HWANIMALS.src.Model.Pet;

import java.time.LocalDate;

public abstract class Creator {

    protected abstract Pet createNewPet(PetType type);

    public Pet createPet(PetType type, String name, LocalDate date) {

        Pet pet = createNewPet(type);
        pet.setName(name);
        pet.setBirthday(date);
        return pet;
    }
}
