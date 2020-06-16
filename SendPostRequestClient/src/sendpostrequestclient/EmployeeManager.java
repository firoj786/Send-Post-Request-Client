
package sendpostrequestclient;

import java.util.Random;

/**
 *
 * @author FirojKhan
 */
public class EmployeeManager {
    
     
  
    public static StatusManager getEmployeeStatus(Employee emp){
         Random random=new Random();
             // int r = (int) ( Math.random() * 201 + 1); // will return either 1 or 2
 
        int r = random.nextInt(202 - 199) + 199;
        return new StatusManager(emp.getEmpId(),r);
    }
    
}
