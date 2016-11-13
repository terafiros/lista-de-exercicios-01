package questao8;

public class Computer {
    
    private String tradeMark;
    private String memorySize;
    private String operacionalSystem;
    
    public Computer(String tradeMark, String memorySize, String operationalSystem){
        this.tradeMark = tradeMark;
        this.memorySize = memorySize;
        this.operacionalSystem = operationalSystem;
    
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getOperacionalSystem() {
        return operacionalSystem;
    }

    public void setOperacionalSystem(String operacionalSystem) {
        this.operacionalSystem = operacionalSystem;
    }
    
    @Override
    public String toString(){
        return String.format("Marca: %s\nTamanho de memoria: %s\nSistema Operacional: %s\n",this.tradeMark, this.memorySize, this.operacionalSystem);
    
    }
    
    
}
