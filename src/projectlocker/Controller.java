package projectlocker;

import java.util.Scanner;

public class Controller {

    private Scanner sc = new Scanner(System.in);
    private LockerTime lt;

    public void mainMenu(LockerSystem ls) {
        int menu;
        do {  
            System.out.println("                         ================");
            System.out.println("                         |   LOCK BOX   |");
            System.out.println("                         ================");
            System.out.println("(1.) Put In");
            System.out.println("(2.) Take Out");
            System.out.println("(3.) Exit");
            System.out.print("Enter number (1 - 3) --> ");
            menu = sc.nextInt();

            switch (menu) {  
                case 1:
                    putIn(ls);
                    break;
                case 2:
                    takeOut(ls);
                    break;
            }

        } while (menu != 3); 

        System.out.println("===========================================================");
        System.out.println("   Thank You for using our service, please comback again   ");
        System.out.println("===========================================================");

    }

    public void putIn(LockerSystem ls) {
        int lockNum;

        System.out.println(" ");
        System.out.println("                         Locker No.            ");
        System.out.println("                        ============            ");
        System.out.println(showLocker(ls));
        System.out.print("Enter Locker No. --> ");
        lockNum = sc.nextInt();
        
        if (checkLocker(lockNum, ls)) {
            System.out.println("----------------------------");
            System.out.println("Service charge 30 Bath/hour.");
            System.out.println("----------------------------");
            rentLocker(ls,lockNum,putInpass());
            saveTime();
            showTime();
        } else {
            System.out.println("Error");
        }

    }
    
    public void takeOut(LockerSystem ls){
        int id;
        System.out.print("Enter LockerID: ");
        id = sc.nextInt();
        if(!(checkLocker(id,ls))){
            chackPass(ls,id);
        }else{
            System.out.println("Error");
        }
    }

    public String showLocker(LockerSystem ls) {
        return ls.getLockerList();
    }
    public String putInpass() {
        String pass;
        System.out.print("Password: ");
        pass = sc.next();
        return pass;
    }
    public boolean checkLocker(int id, LockerSystem ls) {
        if(ls.checkLocker(id)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean chackPass(LockerSystem ls,int id){
        String pass;
        System.out.print("Enter pass: ");
        pass = sc.next();
        if(ls.CheckPass(id, pass)){
            returnLocker(ls,id);
            showTimeNow();
            return true;
        }else{
            System.out.println("Error");
            return false;
        }
       
    }
    
    public void returnLocker(LockerSystem ls, int id){
        ls.returnLocker(id);
    }
    
    public void saveTime() {
        int time;
        int money = 30;
        System.out.print("   Enter Hour ---> ");
        time = sc.nextInt();
        this.lt = new LockerTime(time);
        System.out.print("   Payment amount ---> ");
        int total = time * money;
        System.out.println(total +"Bath");
    }
    
    public void rentLocker(LockerSystem ls,int id, String pass){
        ls.rentLocker(id,pass);
    }

    public void showTime() {
        System.out.println("RentTime:" + this.lt.getRentTime() + " | " + "ReturnTime:" + this.lt.retunTime);
        System.out.println(" ");
    }

    public void showTimetakeOut() {
        System.out.println("ReturnTime:" + this.lt.retunTime);
        System.out.println(" ");
    }
    
    public void showTimeNow(){
        System.out.println("TimeNow:" + this.lt.getNowTime());
    }
}
