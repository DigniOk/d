package shop;

enum Holidays {
    NEW_YEAR, MARCH_8, FEBRUARY_23, None_day;
}

  public class Yahoo {
    Holidays holidays;
    public Yahoo(Holidays holidays) {
        this.holidays = holidays;
    }
    public void daysIsYahoo() {
        switch (holidays) {
 
            case NEW_YEAR:
                System.out.println("С Новым Годом!");
                break;
            case FEBRUARY_23:
                System.out.println("С пзадником День Защитника Отечества - 23 февраля!");
                break;
            case MARCH_8:
                System.out.println("С празником Всемирный Женский День - 8 марта!");
                break;
            case None_day: System.out.println("Хорошего дня");
                break;
        }
    }
  }