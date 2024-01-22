package shop;

public class People {
  private String lastName;
  private String firstName;
  private int age;
  private String phone;
  private Gender gender;

  public People(String lastName, String firstName, int age, String phone, Gender gender) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.age = age;
    this.phone = phone;
    this.gender = gender;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
 
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
 
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
 
  public Gender getGender() {
    return gender;
  }
}
    

