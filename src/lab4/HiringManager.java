package lab4;

import java.util.ArrayList;
import java.util.Date;

public class HiringManager {

    private ArrayList<String> vacantCubes;
    private ArrayList<Employee> employees;


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
}
