
package questao02;

public class Start {
    
    public static void main(String[] args) {
        Lamp l = new Lamp(State.OFF);
        l.isOn();
        l.setState(State.ON);
        l.isOn();
        l.setState(State.HALFLIGHT);
        l.isOn();
    }
    
}
