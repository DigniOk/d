package MYHWA;

import MYHWA.Controller.PetController;
import MYHWA.Model.Pet;
import MYHWA.Services.IRepository;
import MYHWA.Services.PetRepository;
import MYHWA.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> friends_mans = new PetRepository();
        PetController controller = new PetController(friends_mans);
        new ConsoleMenu (controller).start();
    }
}    
