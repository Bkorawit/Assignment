
package projectlocker;

public class LockerSystem {
    private Locker locker[];
    private int size;
    private Locker temp_locker;
    private int lockerId = 1;
    
    public LockerSystem(int Size) {
        this.locker = new Locker[Size];
        this.size = Size;
        addLocker();
    }
    
    public void addLocker(){
        for (int i = 0; i < size; i++) {
            this.locker[i] = temp_locker = new Locker(lockerId++);
        }
    }
    
    public boolean checkLocker(int id){
        id -= 1;
        if(locker[id].getStatus() != StatusLocker.UNVALIABLE){
            return true;
        }else{
            return false;
        }
    }
    
    public String getLockerList(){
        String locker = "";
        int count = 1;
        for (int i = 0; i < this.size; i++) {
            if(this.locker[i] != null){
            locker += this.locker[i];
            }
            count++;
            if(count > 3){
                locker += "\n";
                count = 1;
            }
        }
        return locker;
    }
    
    public boolean CheckPass(int id, String pass){
      id -= 1;
      return  locker[id].getPass().equals(pass);
    }
    
    public void rentLocker(int id,String pass){
        id -= 1;
        this.locker[id].setStatus(StatusLocker.UNVALIABLE);
        this.locker[id].setPass(pass);
    }
    
    public void returnLocker(int id){
        id -= 1;
        this.locker[id].setStatus(StatusLocker.AVALIABLE);
        this.locker[id].setPass(null);
    }
}
