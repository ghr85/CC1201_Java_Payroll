package management;

public class Director extends Manager{
    private double budget;

    public Director(String name, String ni, double salary, String deptName,double budget){
        super(name,ni,salary,deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

public double payBonus(){
        return (this.salary * 0.02);
}

    
}
