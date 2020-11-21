
package projectlocker.test;

import projectlocker.Controller;
import projectlocker.LockerSystem;

public class Test {
    public static void main(String[] args) {
        LockerSystem ls = new LockerSystem(9);
        Controller c = new Controller();
        c.mainMenu(ls);
       
    }
}
