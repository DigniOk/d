package HWANIMALS.src.Model;
import HWANIMALS.src.Model.Cat;
import HWANIMALS.src.Model.Dog;
import HWANIMALS.src.Model.Hamster;
import HWANIMALS.src.Model.Pet;
import HWANIMALS.src.Model.PetType;

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
