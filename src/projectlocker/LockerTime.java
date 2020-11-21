package projectlocker;

import java.time.LocalTime;

public class LockerTime {
    LocalTime rentTime;
    LocalTime retunTime;
    
    public LockerTime(int time) {
        this.rentTime = LocalTime.now();
        this.retunTime = rentTime.plusHours(time);
    }

    public LocalTime getRentTime() {
        return rentTime;
    }

    public LocalTime getRetunTime() {
        return retunTime;
    }
    
    public LocalTime getNowTime(){
        return LocalTime.now();
    }
    
    
}
