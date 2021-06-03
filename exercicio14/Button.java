public class Button {

  private Equipment equipment;
  private boolean state;

  public Button(Equipment equipment) {
    this.equipment = equipment;
  }

  public void toggle() {
    state = !state;
    boolean buttonOn = state;
    if (buttonOn) {
      equipment.turnOn();
    } else {
      equipment.turnOff();
    }
  }


  public static void main(String[] args) {
    Button button = new Button(new Fan());
    Button button2 = new Button(new Lamp());
  }
}