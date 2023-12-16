package Animals;

import Animals.Controller.PetController;
import Animals.Model.Pet;
import Animals.Services.IRepository;
import Animals.Services.PetRepository;
import Animals.UserInterface.ConsoleMenu;

public class program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> friends_mans = new PetRepository();
        PetController controller = new PetController(friends_mans);
        new ConsoleMenu (controller).start();
    }
}    
