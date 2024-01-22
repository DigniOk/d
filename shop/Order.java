package shop;

public class Order {
  private People people;
  private Item item;
  private int quantity;
  private double amount;

  public Order(People people, Item item, int quantity) {
    this.people = people;
    this.item = item;
    this.quantity = quantity;
    this.amount = item.getPrice() * quantity;
  }
  public People getPeople() {
    return people;
  }
  public void setPeople(People people) {
    this.people = people;
  }
  public Item getItem() {
    return item;
  }
  public void setItem(Item product) {
    this.item = product;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public double getAmount() {
    return amount;
  }
  public void setAmount(double amount) {
    this.amount = amount;
  }
}
    
