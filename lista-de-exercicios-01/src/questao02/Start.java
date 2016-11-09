
package questao02;

public class Start {
    
    public static void main(String[] args) {
        Lamp l = new Lamp(State.off);
        l.isOn();
        l.setState(State.on);
        l.isOn();
        l.setState(State.halfLight);
        l.isOn();
    }
    
}
