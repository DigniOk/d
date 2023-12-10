package HWANIMALS.ANIMALS;

import HWANIMALS.ANIMALS.Controller.PetController;
import HWANIMALS.ANIMALS.Model.Pet;
import HWANIMALS.ANIMALS.Services.IRepository;
import HWANIMALS.ANIMALS.Services.PetRepository;
import HWANIMALS.ANIMALS.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}    
