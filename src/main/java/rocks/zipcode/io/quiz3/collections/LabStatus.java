package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 * Ensure there are enumerations for, `COMPLETED`, `INCOMPLETE`, `PENDING`
 */
public enum LabStatus {
    COMPLETED(100) , INCOMPLETE(50), PENDING(0);

    int values;
    LabStatus(int val){
        values = val;
    }

}
