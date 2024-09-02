import java.util.Date;
import java.util.Random;

import b.Employee;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Interface e1 = new Employee("José");
        Interface e2 = new Employee("Alfredo");
        TeamMember tm1 = new TeamMember(new Employee("Joca"));
        TeamMember tm2 = new TeamMember(new Employee("Manel"));
        TeamLeader tl1 = new TeamLeader(new Employee("Eugénio"));
        Manager m1 = new Manager(new Employee("Augusto"));

        Interface list[] = {e1,e2,tm1,tm2,tl1,m1};

        for (Interface employee: list){ 
            Date date = new Date();
            employee.start(date); //starts work
            employee.work();
        
        }

        System.out.println("\n");

        for (Interface employee:list){ 

            Random r = new Random(); 
            int low = 1;
            int high = 10000;
            int result = r.nextInt(high-low) + low; //random time to terminate work
            Thread.sleep(result); //sleeps
            Date date2 = new Date(); //gets the date
            employee.terminate(date2); //terminates work
        }

    }
    
}