package lab4;

import java.util.ArrayList;

public class Company {
    private HiringManager hiringManager;
    private ArrayList<Employee> employees;


    public Company() {
        this.hiringManager = new HiringManager();
        this.employees = new ArrayList<>();
    }

    public void hireEmployee(Employee e){
        hiringManager.orientEmployee(e);


    }
}
