
package sendpostrequestclient;

/**
 *
 * @author FirojKhan
 */
public class StatusManager {
    private String employeeStatusId;
    private int statusCode;
    
     public StatusManager(String employeeStatusId,int statusCode){
        super();
        this.employeeStatusId=employeeStatusId;
        this.statusCode=statusCode;
    }

    public String getEmployeeStatusId() {
        return employeeStatusId;
    }

    public void setEmployeeStatusId(String employeeStatusId) {
        this.employeeStatusId = employeeStatusId;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "StatusManager{" + "employeeStatusId=" + employeeStatusId + ", statusCode=" + statusCode + '}';
    }
    
   
    
}
