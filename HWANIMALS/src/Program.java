package HWANIMALS.src;

import HWANIMALS.src.Controller.PetController;
import HWANIMALS.src.Model.Pet;
import HWANIMALS.src.Services.IRepository;
import HWANIMALS.src.Services.PetRepository;
import HWANIMALS.src.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> friends_mans = new PetRepository();
        PetController controller = new PetController(friends_mans);
        new ConsoleMenu (controller).start();
    }
}    
