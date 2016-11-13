package questao02;

public enum State {
    ON(1), OFF(2), HALFLIGHT(3);
    
    public int state;
    State(int state){
        this.state = state;
    }
}
