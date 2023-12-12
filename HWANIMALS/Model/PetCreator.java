package HWANIMALS.Model;
import HWANIMALS.Model.Cat;
import HWANIMALS.Model.Dog;
import HWANIMALS.Model.Hamster;
import HWANIMALS.Model.Pet;
import HWANIMALS.Model.PetType;

public class PetCreator extends Creator {

    @Override
    protected Pet createNewPet (PetType type) {
        
        switch (type) {
            case Cat:
                return new Cat();
            case Dog:
                return new Dog();
            case Hamster:
                return new Hamster();
        }
        return null;
    }

}
