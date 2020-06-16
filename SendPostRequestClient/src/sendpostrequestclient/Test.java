/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sendpostrequestclient;

import com.nt.sensen.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author FirojKhan
 */
public class Test {
    static final int MAX_T=3;

    public static void main(String[] args){
        
        //create five tasks
         Runnable r1=new Task("task 1",EmployeeManager.getEmployeeStatus(new Employee("101", "sony", "SRNager")));
         Runnable r2=new Task("task 2",EmployeeManager.getEmployeeStatus(new Employee("102", "sahitiya","SRNager")));
         Runnable r3=new Task("task 3",EmployeeManager.getEmployeeStatus(new Employee("103", "ravind", "SRNager")));
         Runnable r4=new Task("task 4",EmployeeManager.getEmployeeStatus(new Employee("104", "dharam", "SRNager")));
         Runnable r5=new Task("task 5",EmployeeManager.getEmployeeStatus(new Employee("105", "harsha", "SRNager")));
                    
            //Create a thread pool with MAX_T no. of
            //Threads as the fixed pool size (Step 2)
            ExecutorService pool=Executors.newFixedThreadPool(MAX_T);
            // passes the task objects to the pool to excecute (Step 3)
          pool.execute(r1);
          pool.execute(r2);
          pool.execute(r3);
          pool.execute(r4);
          pool.execute(r5);
        //pool shutdown (Step 4)
           pool.shutdown();
           
            while (!pool.isTerminated()) {
        }
        System.out.println("Finished All Threads:");


           }
    
}
