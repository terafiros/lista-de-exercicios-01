package questao8;

public class Car {
    
    private String color;
    private String tradeMark;
    private String model;
    
    public Car(String color, String tradeMark, String model){
        this.color = color;
        this.tradeMark = tradeMark;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
     @Override
    public String toString(){
        return String.format("\nMarca: %s\nCor: %s\nModelo: %s\n",this.tradeMark, this.color, this.model);
    
    }
  
}
