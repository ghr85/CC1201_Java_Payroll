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
        if (raiseValue >0){this.salary += raiseValue;}
    }

    public double payBonus(){
    return (this.salary * 0.01);
    }

    public void changeName(String name){
        if(name != null){
        this.name = name;
        }
    }

}
