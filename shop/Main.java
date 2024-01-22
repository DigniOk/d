package shop;

import java.util.Random;

public class Main {
  private static People[] peoples = new People[2];
  private static Item[] items = new Item[5];

  public static void main(String[] args) {
    
    peoples[0] = new People("Васильев", "Иван", 25, "89996758473", Gender.MALE);
    peoples[1] = new People("Иванова", "Анастасия", 25, "89453334455", Gender.FEMALE);

    items[0] = new Item("Ball", 200.0);
    items[1] = new Item("Sandwich", 400.0);
    items[2] = new Item("Teble", 600.0);
    items[3] = new Item("Car", 800.0);
    items[4] = new Item("Rocket", 1000.0);
    System.out.println();

    String str = "NEW_YEAR";
    Yahoo e1 = new Yahoo(Holidays.valueOf(str));
    
    Random random = new Random();
    int orderCount = random.nextInt(10) + 1; 
    Order[] orders = new Order[orderCount];

    for (int i = 0; i < orders.length; i++) {
      People People = peoples[random.nextInt(peoples.length)];
      Item Item = items[random.nextInt(items.length)];
      int Quantity = random.nextInt(5) - 1;
      try {
        orders[i] = makePurchase(People.getLastName(), Item.getName(), Quantity);
        System.out.println("Заказ: " + orders[i].getItem().getName() + " Количество: "
            + orders[i].getQuantity() + " Стоимость: " + orders[i].getAmount() +" Покупатель "+ orders[i].getPeople().getLastName());
        e1.daysIsYahoo();
      } catch (PeopleException e) {
        System.out.println(e.getMessage() + " (" + People.getLastName() + ")");
      } catch (ItemException e) {
        System.out.println(e.getMessage() + " (" + Item.getName() + ")");
      } catch (AmountException e) {
        System.out.println(e.getMessage() + " (" + Quantity + ")");
      }
    }

    int count = 0;
    for (Order order : orders) {
      if (order != null) {
        count++;
      }
    }

    System.out.println("Количество совершенных покупок: " + count);

  }
  public static <people> Order makePurchase(String lastName, String itemName, int quantity)
      throws PeopleException, ItemException, AmountException {
    People people = null;
    for (People c : peoples) {
      if (c.getLastName().equals(lastName)) {
        people = c;
        break;
      }
    }

    if (people == null) {
      throw new PeopleException("Несуществующий покупатель: " + lastName);
    }

    Item item = null;
    for (Item p :items) {
      if (p.getName().equals(itemName)) {
        item = p;
        break;
      }
    }

    if (item == null) {
      throw new ItemException("Несуществующий товар: " + itemName);
    }

    if (quantity <= 0 || quantity > 99) {
      throw new AmountException("Неверное количество: " +  " " + lastName + " " + itemName);
    }

    return new Order(people, item, quantity);
  }
}
  
