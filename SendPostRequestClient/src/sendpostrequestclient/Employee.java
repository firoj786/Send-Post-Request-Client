
package sendpostrequestclient;

/**
 *
 * @author FirojKhan
 */
public class Employee {
    private String empId;
    private String empName;
    private String Address;
    public Employee(String empId,String empName,String Address){
        this.empId=empId;
        this.empName=empName;
        this.Address=Address;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", Address=" + Address + '}';
    }
    
   
    
}
