package rocks.zipcode.io.quiz3.collections;

import java.util.HashMap;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    HashMap<String, Lab> labMap;

    public Student() {
        labMap = new HashMap<>();
    }

    public Student(List<Lab> labs) {
        for (Lab lab : labs){
            labMap.put(lab.getName(), lab);
        }
    }

    public Lab getLab(String labName) {
        return labMap.get(labName);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labMap.put(lab.getName(),lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }
}
