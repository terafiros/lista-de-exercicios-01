package questao02;

public class Lamp {
    private State state;
    
    public Lamp(State initialState){
        this.state = initialState;
    }
    
    public void isOn(){
        System.out.println(this.state);
    }
    
    public void setState(State newState){
        this.state = newState;
    }
    
}
