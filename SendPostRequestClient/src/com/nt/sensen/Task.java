
package com.nt.sensen;

import java.text.SimpleDateFormat;
import java.util.Date;
import sendpostrequestclient.StatusManager;

/**
 *
 * @author FirojKhan
 */
public class Task implements Runnable{
    private String name;
    private StatusManager statusManager;
    public Task(String name,StatusManager statusManager ){
        this.name=name;
        this.statusManager=statusManager;
    }
    public void run(){
         try{
            for(int i=0;i<=5; i++){
                if(i==0){
                    Date d=new Date();
                    SimpleDateFormat t=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Employee Initialization time for:"+"task name-" +name+" With Employee Status Id:-"+statusManager.toString()+"  "+t.format(d));
                }
                else{
                   Date d=new Date();
                    SimpleDateFormat t=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Employee Object Excecution time for task name-:"+"task name -" +name+" -With Employee Status Code:"+statusManager.toString()+" "+t.format(d));
                }
                Thread.sleep(1000);
                }
            System.out.println("Complete:"+name);
                    
                }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
 }
