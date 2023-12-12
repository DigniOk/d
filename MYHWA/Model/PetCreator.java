package MYHWA.Model;
import MYHWA.Model.Cat;
import MYHWA.Model.Dog;
import MYHWA.Model.Hamster;
import MYHWA.Model.Pet;
import MYHWA.Model.PetType;

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
