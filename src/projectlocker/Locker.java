package projectlocker;

public class Locker {

    private int lockerId;
    private StatusLocker status = StatusLocker.AVALIABLE;
    private String pass;

    public Locker(int lockerId) {
        this.lockerId = lockerId;
    }

    public int getLockerId() {
        return lockerId;
    }

    public StatusLocker getStatus() {
        return status;
    }

    public void setLockerId(int lockerId) {
        this.lockerId = lockerId;
    }

    public void setStatus(StatusLocker status) {
        this.status = status;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "[" + "No." + "|" + " " + lockerId + " " + status + ']'; //ไม่มีคนเช่า
    }
}
