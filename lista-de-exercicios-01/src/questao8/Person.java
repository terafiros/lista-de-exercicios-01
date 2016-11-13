package questao8;

public class Person {
    private String name;
    private int age;
    private char sex;
    private Car car;
    private Computer computer;
    
    public Person(String name, int age, char sex,Car car,Computer computer){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.car = car;
        this.computer = computer;
                
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    
     @Override
    public String toString(){
        return String.format("Nome: %s\nIdade: %s\nSexo: %s\n%s \n%s \n",this.name, this.age, this.sex, car.toString(), computer.toString());
    
    }
    
}
