package questao02;

public enum State {
    on(1), off(2), halfLight(3);
    
    public int state;
    State(int state){
        this.state = state;
    }
}
