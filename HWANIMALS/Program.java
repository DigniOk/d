package HWANIMALS;

import HWANIMALS.Controller.PetController;
import HWANIMALS.Model.Pet;
import HWANIMALS.Services.IRepository;
import HWANIMALS.Services.PetRepository;
import HWANIMALS.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> friends_mans = new PetRepository();
        PetController controller = new PetController(friends_mans);
        new ConsoleMenu (controller).start();
    }
}    
