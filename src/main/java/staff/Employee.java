package staff;


public abstract class Employee {
    protected double salary;
    protected String name;
    protected String ni;

    public Employee(String name, String ni, double salary){
        this.salary = salary;
        this.name = name;
        this.ni = ni;

    }

    public String getName(){
    return this.name;
    }

    public String getNi(){
        return this.ni;
    }

    public double getSalary(){
        return this.salary;
    }
    public void raiseSalary(double raiseValue){
        this.salary += raiseValue;
    }

    public double payBonus(){
    return (this.salary * 0.01);
    }

}
