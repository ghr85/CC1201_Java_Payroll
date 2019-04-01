package staff;


public abstract class employee {
    private double salary;
    private String name;
    private String ni;

    public employee(String name, String ni, double salary){
        this.salary = salary;
        this.name = name;
        this.ni = ni;

    }

    public void raiseSalary(double raiseValue){
        this.salary += raiseValue;
    }

    public void payBonus(){

    }
}
