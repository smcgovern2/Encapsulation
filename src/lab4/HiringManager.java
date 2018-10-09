package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HiringManager {

    private ArrayList<String> vacantCubes;
    private ArrayList<Employee> employees;

    public HiringManager() {
        this.vacantCubes = new ArrayList<String>(Arrays.asList("A101", "A102", "A103"));
    }

    public void orientEmployee(Employee e){
        e.doFirstTimeOrientation(getNextVacantCube());
    }

    private String getNextVacantCube(){
        if(vacantCubes.size() > 0){
            String cubeId = vacantCubes.get(vacantCubes.size()-1);
            vacantCubes.remove(vacantCubes.size()-1);
            return cubeId;
        } else {
        return "Temporarily Unnassigned";
        }

    }

    public ArrayList<String> getVacantCubes() {
        return vacantCubes;
    }

    public void setVacantCubes(ArrayList<String> vacantCubes) {
        this.vacantCubes = vacantCubes;
    }
}
