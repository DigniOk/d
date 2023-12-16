package Animals;

import Animals.Controller.PetController;
import Animals.Model.Pet;
import Animals.Services.IRepository;
import Animals.Services.PetRepository;
import Animals.UserInterface.ConsoleMenu;

public class program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}    
